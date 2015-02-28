package com.kirwa.operators.area;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public class AreaCalculator {
    public static double calculateArea(com.kirwa.operators.area.Area myArea) {
        double calculatedArea=0;
        final double pi = 22f/7f;
        switch(myArea.getAreaType()){
            case SQUARE:
                calculatedArea = myArea.getDimensions()[0]*myArea.getDimensions()[0];
                break;
            case RECTANGLE:
                calculatedArea = myArea.getDimensions()[0]*myArea.getDimensions()[1];
                break;
            case CIRCLE:
                calculatedArea = pi * myArea.getDimensions()[0]*myArea.getDimensions()[0];
                break;
            default:

        }
        return calculatedArea;
    }



}
