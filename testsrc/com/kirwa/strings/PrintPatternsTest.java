package com.kirwa.strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by KIRTESH WANI on 2/28/15.
 */
public class PrintPatternsTest {
    @Test
    public void printAllCircularCombinationOfGiverString(){
        String inputStr ="KIRTESH";
        String[] expectedResult = {"KIRTESH","IRTESHK","RTESHKI","TESHKIR","ESHKIRT","SHKIRTE","HKIRTES"};
        Assert.assertArrayEquals(expectedResult,PrintPatterns.getCircularPatterns(inputStr));
    }

    @Test
    public void testToCountTheNumberOfOccurrenceOfStringInString(){
        String mainStr = "I am an Indian and I Love India";
        Assert.assertEquals(2,PrintPatterns.findOccurrence(mainStr, "India"));
        Assert.assertEquals(4,PrintPatterns.findOccurrence(mainStr, "I"));
    }


}
