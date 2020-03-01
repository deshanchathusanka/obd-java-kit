package com.obd.mapper.pid;

/**
 * Created by Deshan on 10/13/16.
 */
public class NoOfBytesInPIDFinder {
    private static int noOfBytes;

    public static int getNoOfBytes(String pidStr){
        char[] pidStrChar = pidStr.toCharArray();
        pidStrChar[1] = Character.toLowerCase(pidStrChar[1]);
        pidStr = String.valueOf(pidStrChar);
        if ("00".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("01".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("02".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("03".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("04".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("05".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("06".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("07".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("08".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("09".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("0a".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("0b".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("0c".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("0d".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("0e".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("0f".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("10".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("11".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("12".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("13".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("14".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("15".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("16".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("17".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("18".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("19".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("1a".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("1b".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("1c".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("1d".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("1e".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("1f".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("20".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("21".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("22".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("23".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("24".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("25".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("26".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("27".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("28".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("29".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("2a".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("2b".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("2c".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("2d".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("2e".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("2f".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("30".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("31".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("32".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("33".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("34".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("35".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("36".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("37".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("38".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("39".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("3a".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("3b".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("3c".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("3d".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("3e".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("3f".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("40".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("41".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("42".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("43".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("44".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("45".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("46".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("47".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("48".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("49".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("4a".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("4b".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("4c".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("4d".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("4e".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("4f".equals(pidStr)) {
            noOfBytes = 4;
        } else if ("50".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("51".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("52".equals(pidStr)) {
            noOfBytes = 1;
        } else if ("53".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("54".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("55".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("56".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("57".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("58".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("59".equals(pidStr)) {
            noOfBytes = 2;
        } else if ("5a".equals(pidStr)) {
            noOfBytes = 1;
        } else {
            noOfBytes = 1;
        }
        return noOfBytes;
    }
}
