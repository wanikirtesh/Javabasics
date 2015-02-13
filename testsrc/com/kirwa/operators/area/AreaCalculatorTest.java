package com.kirwa.operators.area;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public class AreaCalculatorTest {
    @Test
    public void testForCalculateAreaOfSquare(){
        Area myArea = new Area(AreaTypes.SQUARE,3f);
        Assert.assertEquals(9f,AreaCalculator.calculateArea(myArea),0);
    }


    @Test
    public void testForCalculateAreaOfRectangle(){
        Area myArea = new Area(AreaTypes.RECTANGLE,3f,3f);
        Assert.assertEquals(9f,AreaCalculator.calculateArea(myArea),0);
    }

    @Test
    public void testForCalculateAreaOfCircle(){
        Area myArea = new Area(AreaTypes.CIRCLE,3f);
        Assert.assertEquals(28.28,AreaCalculator.calculateArea(myArea),0.01);
    }

}
