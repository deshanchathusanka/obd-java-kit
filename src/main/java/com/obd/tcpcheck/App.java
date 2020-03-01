package com.obd.tcpcheck;


import com.obd.mapper.ServerSocketCreater;
import org.apache.log4j.Logger;

public class App
{
    //static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        //run stream Analytics job
//        try {
//            StreamAnalyticsClient.streamAnalytics();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //listen devices on port 7000
        ServerSocketCreater serverSocketCreater = new ServerSocketCreater(7000);
        Thread readerThread = new Thread(serverSocketCreater);
        readerThread.start();

    }
}
