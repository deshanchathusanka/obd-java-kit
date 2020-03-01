package com.obd.mapper.pid;

import com.obd.mapper.VehicleDetailsStoreMan;
import com.obd.mapper.operation.HexUtils;
import org.apache.commons.codec.binary.Hex;

/**
 * Created by Deshan on 10/13/16.
 */
public class PIDInformationMaker {

    String[] obdRequirmentArray={
            "",
            "OBD II (California ARB)",
            "OBD (Federal EPA)",
            "OBD and OBD II",
            "OBD I",
            "Not OBD compliant",
            "EOBD",
            "EOBD and OBD II",
            "EOBD and OBD",
            "EOBD, OBD and OBD II",
            "JOBD",
            "JOBD and OBD II",
            "JOBD and EOBD",
            "JOBD, EOBD, and OBD II",
            "Heavy Duty Vehicles (EURO IV) B1",
            "Heavy Duty Vehicles (EURO V) B2",
            "Heavy Duty Vehicles (EURO EEC)",
            "Engine Manufacturer Diagnostics (EMD)"
    };

    private VehicleDetailsStoreMan vehicleDetailsStoreMan;
    public PIDInformationMaker(VehicleDetailsStoreMan vehicleDetailsStoreMan){
        this.vehicleDetailsStoreMan = vehicleDetailsStoreMan;
    }

    public void setPidInformation(String pidStr, String pidDataStr){
        char[] pidStrChar = pidStr.toCharArray();
        pidStrChar[1] = Character.toLowerCase(pidStrChar[1]);
        pidStr = String.valueOf(pidStrChar);
        if ("04".equals(pidStr)) {
            vehicleDetailsStoreMan.setCalculatedLoadValue_percentage(getCalculatedLoadValue(pidDataStr));
        } else if ("05".equals(pidStr)) {
            vehicleDetailsStoreMan.setEngineCoolentTemperature(getEngineCoolentTemperature(pidDataStr));
        } else if ("0a".equals(pidStr)) {
            vehicleDetailsStoreMan.setFuelRailPressure(getFuelRailPressure(pidDataStr));
        } else if ("0b".equals(pidStr)) {
            vehicleDetailsStoreMan.setIntakeManifoldAbsoluteTemperature(getIntakeManifoldAbsoluteTemperature(pidDataStr));
        } else if ("0c".equals(pidStr)) {
            vehicleDetailsStoreMan.setEngineRPM(getEngineRPM(pidDataStr));
        } else if ("0d".equals(pidStr)) {
            vehicleDetailsStoreMan.setSpeed(getVehicleSpeed(pidDataStr));
        } else if ("0f".equals(pidStr)) {
            vehicleDetailsStoreMan.setIntakeAirTemparature(getIntakeAirTemparature(pidDataStr));
        } else if ("10".equals(pidStr)) {
            vehicleDetailsStoreMan.setMafAirFlowRat(getMAFAirFlowRate(pidDataStr));
        } else if ("11".equals(pidStr)) {
            vehicleDetailsStoreMan.setAbsoluteThrottlePosition(getAbsoluteThrottlePosition(pidDataStr));
        } else if ("1c".equals(pidStr)) {
            vehicleDetailsStoreMan.setObdRequirement(getOBDRequirment(pidDataStr));
        } else if ("1f".equals(pidStr)) {
            vehicleDetailsStoreMan.setTimeSinceEngineStart(getTimeSinceEngineStart(pidDataStr));
        } else if ("21".equals(pidStr)) {
            vehicleDetailsStoreMan.setDistanceTraveledWhileMILisActivated(getDistanceTraveledWhileMILisActivated(pidDataStr));
        } else if ("2f".equals(pidStr)) {
            vehicleDetailsStoreMan.setFuelLevel(getFuelLevelInput(pidDataStr));
        } else if ("30".equals(pidStr)) {
            vehicleDetailsStoreMan.setNoOfWarmUpsSinceDTCsCleared(getNoOfWarmUpsSinceDTCsCleared(pidDataStr));
        } else if ("31".equals(pidStr)) {
            vehicleDetailsStoreMan.setDistanceTraveledSinceDTCsCleared(getDistanceTraveledSinceDTCsCleared(pidDataStr));
        } else if ("33".equals(pidStr)) {
            vehicleDetailsStoreMan.setBarometricPressure(getBarometricPressure(pidDataStr));
        } else if ("42".equals(pidStr)) {
            vehicleDetailsStoreMan.setControlModuleVoltage(getControlModuleVoltage(pidDataStr));
        } else if ("43".equals(pidStr)) {
            vehicleDetailsStoreMan.setAbsoluteLoadValue(getAbsoluteLoadValue(pidDataStr));
        } else if ("46".equals(pidStr)) {
            vehicleDetailsStoreMan.setAmbientAirTemperature(getAmbientAirTemperature(pidDataStr));
        } else if ("4c".equals(pidStr)) {
            vehicleDetailsStoreMan.setCommandedThrottleActuatorControl(getCommandedThrottleActuatorControl(pidDataStr));
        } else if ("4d".equals(pidStr)) {
            vehicleDetailsStoreMan.setEngineRunTimeWhileMILON(getEngineRunTimeWhileMILON(pidDataStr));
        } else if ("4e".equals(pidStr)) {
            vehicleDetailsStoreMan.setEngineRunTimeSinceDTCsCleared(getEngineRunTimeSinceDTCsCleared(pidDataStr));
        } else if ("52".equals(pidStr)) {
            vehicleDetailsStoreMan.setAlcoholFuelPercentage(getAlcoholFuelPercentage(pidDataStr));
        }
    }

    private String getEngineCoolentTemperature(String pidDataStr) {
        String engineCoolentTemperature = Integer.toString(Integer.parseInt(pidDataStr,16));
        return engineCoolentTemperature;

    }

    private String getIntakeManifoldAbsoluteTemperature(String pidDataStr){
        String intakeManifoldAbsoluteTemperature = Integer.toString(Integer.parseInt(pidDataStr,16));
        return  intakeManifoldAbsoluteTemperature;

    }

    private String getEngineRPM(String pidDataStr){
        String engineRPM = Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return engineRPM;
    }

    private String getVehicleSpeed(String pidDataStr){
        String speed = Integer.toString(Integer.parseInt(pidDataStr,16));
        return speed;
    }

    private String getIntakeAirTemparature(String pidDataStr){
        String intakeAirTemparature = Integer.toString(Integer.parseInt(pidDataStr,16));
        return intakeAirTemparature;
    }

    private String getMAFAirFlowRate(String pidDataStr){
        String mafAirFlowRate = Double.toString(Integer.parseInt(pidDataStr,16)*0.01);
        return mafAirFlowRate;
    }

    private String getCalculatedLoadValue(String pidDataStr){
        String calculatedLoadValue=Integer.toString(Integer.parseInt(pidDataStr,16));
        return calculatedLoadValue;
    }

    private String getFuelRailPressure(String pidDataStr){
        String fuelRailPressure=Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return fuelRailPressure;
    }

    private String getAbsoluteThrottlePosition(String pidDataStr){
        String absoluteThrottlePosition=Integer.toString(Integer.parseInt(pidDataStr,16));
        return absoluteThrottlePosition;
    }

    private String getOBDRequirment(String pidDataStr){
        String obdRequirment=obdRequirmentArray[Integer.parseInt(pidDataStr,16)];
        return obdRequirment;
    }

    private String getTimeSinceEngineStart(String pidDataStr){
        String timeSinceEngineStart=Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return timeSinceEngineStart;
    }

    private String getDistanceTraveledWhileMILisActivated(String pidDataStr){
        String distanceTraveledWhileMILisActivated=Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return distanceTraveledWhileMILisActivated;
    }

    private String getFuelLevelInput(String pidDataStr){
        String fuelLevelInput=Integer.toString(Integer.parseInt(pidDataStr,16));
        return fuelLevelInput;
    }

    private String getNoOfWarmUpsSinceDTCsCleared(String pidDataStr){
        String noOfWarmUpsSinceDTCsCleared=Integer.toString(Integer.parseInt(pidDataStr,16));
        return noOfWarmUpsSinceDTCsCleared;
    }

    private String getDistanceTraveledSinceDTCsCleared(String pidDataStr){
        String distanceTraveledSinceDTCsCleared=Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return distanceTraveledSinceDTCsCleared;
    }

    private String getBarometricPressure(String pidDataStr){
        String barometricPressure=Integer.toString(Integer.parseInt(pidDataStr,16));
        return barometricPressure;
    }

    private String getControlModuleVoltage(String pidDataStr){
        String controlModuleVoltage=Double.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16)/1000.0);
        return  controlModuleVoltage;
    }

    private String getAbsoluteLoadValue(String pidDataStr){
        String absoluteLoadValue=Integer.toString(Integer.parseInt(pidDataStr,16));
        return absoluteLoadValue;
    }

    private String getAmbientAirTemperature(String pidDataStr){
        String ambientAirTemperature=Integer.toString(Integer.parseInt(pidDataStr,16));
        return ambientAirTemperature;
    }

    private String getCommandedThrottleActuatorControl(String pidDataStr){
        String commandedThrottleActuatorControl=Integer.toString(Integer.parseInt(pidDataStr,16));
        return commandedThrottleActuatorControl;
    }

    private String getEngineRunTimeWhileMILON(String pidDataStr){
        String engineRunTimeWhileMILOn=Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return engineRunTimeWhileMILOn;
    }

    private String getEngineRunTimeSinceDTCsCleared(String pidDataStr){
        String engineRunTimeSinceDTCsCleared=Integer.toString(Integer.parseInt(HexUtils.getReverseOrderedHexString(pidDataStr),16));
        return engineRunTimeSinceDTCsCleared;
    }

    private String getAlcoholFuelPercentage(String pidDataStr){
        String alcoholFuelPercentage=Integer.toString(Integer.parseInt(pidDataStr,16));
        return alcoholFuelPercentage;
    }


}
