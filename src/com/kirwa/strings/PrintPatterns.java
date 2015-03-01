package com.kirwa.strings;

/**
 * Created by KIRTESH WANI on 2/28/15.
 */
public class PrintPatterns {
    public static String[] getCircularPatterns(String inputStr) {
        String[] resultPattern = new String[inputStr.length()];
        for(int i =0;i<inputStr.length();i++){
            resultPattern[i]=inputStr;
            inputStr = inputStr.substring(1)+inputStr.substring(0,1);
        }
        return resultPattern;
    }

    public static int findOccurrence(String mainStr, String subStr) {
        int count =0;
        int startIndex=0;
        while(mainStr.indexOf(subStr,startIndex)>=0){
            count++;
            startIndex = mainStr.indexOf(subStr,startIndex)+1;
        }

        return count;
    }

    public static String diZipZap(String inputStr) {
        int startIndex=0;
        while(inputStr.indexOf("z",startIndex)>=0 && inputStr.indexOf("z",startIndex)<=inputStr.length()-2){
            startIndex = inputStr.indexOf("z",startIndex)+1;
            if(inputStr.charAt(startIndex+1)=='p'){
                inputStr = inputStr.substring(0,startIndex)+inputStr.substring(startIndex+1);
            }
        }
        return inputStr;
    }
}
