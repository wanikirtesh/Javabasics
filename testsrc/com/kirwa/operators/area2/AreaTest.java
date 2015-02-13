package com.kirwa.operators.area2;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by Kirtesh Wani on 13-02-2015.
 * for JavaBasics
 * *****************************
 */
public class AreaTest {
    @Test
     public void testForAreaOfSquare(){
        Area a = Area.SQUARE;
        Assert.assertEquals(9f,a.calculateArea(3f),0);
    }

    @Test
    public void testForAreaOfRectangle(){
        Area a = Area.RECTANGLE;
        Assert.assertEquals(6f,a.calculateArea(3f,2f),0);
    }
}
