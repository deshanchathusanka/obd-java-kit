package com.obd.mapper;

import com.google.gson.Gson;
import com.obd.azure.DataSenderForIoTHub;
import com.obd.mapper.operation.DateTimeOperater;
import com.obd.mapper.stat.StatDataMaker;
import org.apache.log4j.Logger;

import java.util.concurrent.ExecutionException;

/**
 * Created by Deshan on 10/12/16.
 */
public class ParameterMakerFromLoginPackage extends Thread {
    static Logger log = Logger.getLogger(ParameterMakerFromLoginPackage.class.getName());
    private String loginPackageStr;
    private VehicleDetailsStoreMan vehicleDetailsStoreMan;
    private DataSenderForIoTHub dataSenderForIoTHub;
    private String deviceId;

    public ParameterMakerFromLoginPackage(VehicleDetailsStoreMan vehicleDetailsStoreMan, String loginPackageStr, DataSenderForIoTHub dataSenderForIoTHub,String deviceId){
        this.vehicleDetailsStoreMan = vehicleDetailsStoreMan;
        this.loginPackageStr = loginPackageStr;
        this.dataSenderForIoTHub = dataSenderForIoTHub;
        this.deviceId=deviceId;
    }


    public  void run(){
        //set stat_data
        StatDataMaker.setStatData(vehicleDetailsStoreMan,loginPackageStr.substring(54,122),"loginPacket",deviceId);

        //set gps data
        GPSDataMaker.setGPSdata(vehicleDetailsStoreMan,loginPackageStr.substring(122,162));

        //set current date and time
        vehicleDetailsStoreMan.setId(DateTimeOperater.GetUTCdatetimeAsString());

        //send data to iot hub
        dataSenderForIoTHub.setMsgString(vehicleDetailsStoreMan.serialize());
        Thread dataSenderForIotHubThread = new Thread(dataSenderForIoTHub);
        dataSenderForIotHubThread.start();

        //send to kafka topic
//        try {
//            DataSenderToKafkaTopics.sendData(vehicleDetailsStoreMan);
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Gson gson = new Gson();
        String vehicleDetailsStoreManString = gson.toJson(vehicleDetailsStoreMan).toString();
        log.info("Data from login packet :" + vehicleDetailsStoreManString);

    }


}
