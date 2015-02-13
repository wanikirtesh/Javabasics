package com.kirwa.operators.area2;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public enum Area {
   SQUARE{
       @Override
       double calculateArea(double... dimension) {
           return dimension[0]*dimension[0];
       }
   },RECTANGLE{
        @Override
        double calculateArea(double... dimension) {
            return dimension[0]*dimension[1];
        }
    };
    abstract double calculateArea(double... dimension);
}
