package com.kirwa.operators;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by KIRTESH WANI on 2/12/15.
 */
public class ArithmeticTest {

    // Test annotation for defining test
    @Test
    public void testForAdditionOperations(){
        // Define variable without initialising
        int intNumber1, intNumber2;

        // assigning value to variable
        intNumber1=10;
        intNumber2=20;

        // Define variable with initialise it
        int intResult = intNumber1+intNumber2;

        // asserting the intResult
        assertEquals(30,intResult);
    }

    @Test
    public void testForSubtractionTest(){
        int intNumber1=20, intNumber2=10;

        // assert directly operation with result
        assertEquals(10,intNumber1-intNumber2);
    }

    @Test
    public void testForIncrementOperator(){
        int myCounter=1;
        // increment the value of variable with 1
        myCounter++;
        assertEquals(2,myCounter);

       // increment the value of variable with 5
        myCounter+=5;

        assertEquals(7,myCounter);

        // if we put ++ sign after variable it first performs operation & then increment the value
            //value remain same while assert operation
        assertEquals(7,myCounter++);
            // it increments after operation
        assertEquals(8,myCounter);

        // if we put ++ sign prior to variable it first performs increment and then operation
        assertEquals(9,++myCounter);
    }

    @Test
    public void testForDecrementOperator(){
        int myCounter=10;
        // decrement the value of variable with 1
        myCounter--;
        assertEquals(9,myCounter);

        // decrement the value of variable with 5
        myCounter-=5;

        assertEquals(4,myCounter);

        // if we put -- sign after variable it first performs operation & then decrement the value
        //value remain same while assert operation
        assertEquals(4,myCounter--);
        // it decrements after operation
        assertEquals(3,myCounter);

        // if we put -- sign prior to variable it first performs decrement and then operation
        assertEquals(2,--myCounter);
    }

    @Test
    public void testForDivisionOperation(){
        int intNumber1=10,intNumber2=4;

        // here we are casting the integer to float (Conversion of type on run time)

        float result =intNumber1/(float)intNumber2;

        //third argument is for threshold value for floating points
        assertEquals(2.5,result,0);
    }

    @Test
    public void testForMultiplicationOperation(){
        int intNumber1=10,intNumber2=4;
        int result = intNumber1*intNumber2;
        assertEquals(40,result);
    }

    @Test
    public void testForModOperation(){
        int intNumber1=14, intNumber2=5;
        int result = 14%5;
        // Mod '%' returns reminder
        assertEquals(4,result);
    }
}
