package com.kirwa.operators;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public class PersistCalculator {
   /// added static keyword to method so that the method can directly available to class
    /// no need to have object of the class

    public static int performAddition(int number1, int number2) {
        return number1+number2;
    }

    public static int performSubtraction(int number1, int number2) {
        return number1-number2;
    }

    public static int performMultiplication(int number1, int number2) {
        return number1*number2;
    }

    public static int performDivision(int number1, int number2) {
        return number1/number2;
    }

    public static double performSubtraction(double number1, double number2) {
        return number1-number2;
    }
    public static double performMultiplication(double number1, double number2) {
        return number1*number2;
    }

    public static double performDivision(double number, double number2) {
        return number/number2;
    }
}
