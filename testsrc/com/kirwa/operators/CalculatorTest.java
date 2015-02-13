package com.kirwa.operators;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by KIRTESH WANI on 2/12/15.
 */
public class CalculatorTest {

    @Test
    public void testForAdditionWithCalculatorObject(){
        // Creating object of of Calculator Class
        Calculator myCalc = new Calculator();

        //Using myCalc object method to perform addition
        int result = myCalc.performAddition(10,5);

        // asserting result
        Assert.assertEquals(15,result);
    }

    @Test
    public void testForOtherArithmeticOperations(){
        Calculator myCalc = new Calculator();
        Assert.assertEquals(10,myCalc.performSubtraction(20, 10));
        Assert.assertEquals(10,myCalc.performMultiplication(5,2));
        Assert.assertEquals(10,myCalc.performDivision(20,2));
    }

    @Test
    public void testForFloatingValuesWithCalculator(){
        Calculator myCalc = new Calculator();
        Assert.assertEquals(10.3,myCalc.performSubtraction(20.5, 10.2),0);
        Assert.assertEquals(25.0,myCalc.performMultiplication(10,2.5),0);

        // directly casting number to float
        Assert.assertEquals(2.5,myCalc.performDivision(5f,2),0);
    }

}
