package com.kirwa.operators.area;

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
    public void basicAreaTypeTest(){
        Area a = new Area(AreaTypes.CIRCLE,12);
        Assert.assertEquals(AreaTypes.CIRCLE,a.getAreaType());
    }
    @Test
    public void basicAreaDimensionTest(){
        Area a = new Area(AreaTypes.CIRCLE,12);
        Assert.assertArrayEquals(new double[]{12},a.getDimensions(),0);
    }
}
