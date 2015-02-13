package com.kirwa.operators;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public class PersistCalculatorTest {
    @Test
    public void testForAdditionWithCalculatorObject(){
        // Creating object of of Calculator Class
        //Using direct class to perform addition
        int result = PersistCalculator.performAddition(10,5);

        // asserting result
        Assert.assertEquals(15, result);
    }

    @Test
    public void testForOtherArithmeticOperations(){
        Assert.assertEquals(10,PersistCalculator.performSubtraction(20, 10));
        Assert.assertEquals(10,PersistCalculator.performMultiplication(5,2));
        Assert.assertEquals(10,PersistCalculator.performDivision(20,2));
    }

    @Test
    public void testForFloatingValuesWithCalculator(){
        Assert.assertEquals(10.3,PersistCalculator.performSubtraction(20.5, 10.2),0);
        Assert.assertEquals(25.0,PersistCalculator.performMultiplication(10,2.5),0);

        // directly casting number to float
        Assert.assertEquals(2.5,PersistCalculator.performDivision(5f,2),0);
    }
}
