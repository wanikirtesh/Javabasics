package com.kirwa.conditions;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by Kirtesh Wani on 16-02-2015.
 * for JavaBasics
 * *****************************
 */
public class ConditionCheckerTest {
    @Test
    public void testForValidateValidVoterByAge() throws Exception {
        // validate the person is valid voter on the basis of input age
        int ageOfPerson = 20;
        Assert.assertTrue(ConditionChecker.isValidVoter(ageOfPerson));
    }

    @Test
    public void testForCheckTheTriangleTypeForEquilateralTriangle(){
        int angle1=60;
        int angle2=60;
        int angle3=60;
        Assert.assertEquals(ConditionChecker.TriangleTypes.EQUILATERAL,ConditionChecker.getTriangleType(angle1,angle2,angle3));
    }
    @Test
    public void testForCheckTheInvalidTriangle(){
        int angle1=60;
        int angle2=60;
        int angle3=90;
        Assert.assertEquals(ConditionChecker.TriangleTypes.NA,ConditionChecker.getTriangleType(angle1,angle2,angle3));
    }
    @Test
    public void testForCheckTheTriangleTypeForRightAngleTriangle(){
        int angle1=30;
        int angle2=90;
        int angle3=60;
        Assert.assertEquals(ConditionChecker.TriangleTypes.RIGHTANGLE,ConditionChecker.getTriangleType(angle1,angle2,angle3));
    }

    @Test
    public void testForCheckTheTriangleTypeForIsoscelesTriangle(){
        int angle1=30;
        int angle2=75;
        int angle3=75;
        Assert.assertEquals(ConditionChecker.TriangleTypes.ISOSCELES,ConditionChecker.getTriangleType(angle1,angle2,angle3));
    }
}
