package com.kirwa.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by KIRTESH WANI on 3/7/15.
 */
public class ArrayTest {
    @Test
    public void duplicateTheArrayInGivenArray(){
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = MyArray.getDuplicate(array1);
        Assert.assertArrayEquals(array1,array2);
    }

    @Test
    public void calculateSumOfAllElementsGivenArray(){
        int[] array1 = {1,2,3,4,5,6};
        Assert.assertEquals(21,MyArray.getSumOfArray(array1));
    }

    @Test
    public void checkTheArrayEquallySplitInTwoParts(){
        int[] array1 = {1,2,3,2,4};
        /* if we observe above array we can split in two part
         * 1,2,3 and 2,4 having`equal sum so it function will
         * return true */
        Assert.assertTrue(MyArray.canSplitEqual(array1));
    }

    @Test
    public void checkTheArrayCanNotEquallySplitInTwoParts(){
        int[] array1 = {3,2,3,2,4};
        /* if we observe above array we can split in two part
         * 1,2,3 and 2,4 having`equal sum so it function will
         * return true */
        Assert.assertFalse(MyArray.canSplitEqual(array1));
    }



}
