package com.kirwa.arrays;

/**
 * Created by KIRTESH WANI on 3/7/15.
 */
public class MyArray {
    public static int[] getDuplicate(int[] array1) {
        int[] resultArray = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            resultArray[i] = array1[i];
        }
        return resultArray;
    }

    public static int getSumOfArray(int[] array1) {
        int sum=0;
        for (int i : array1) {
            sum+=i;
        }
        return sum;
    }

    public static boolean canSplitEqual(int[] array1) {
        int lhs=0,rhs=0;
        for(int i=0;i<array1.length;i++) {
            lhs += array1[i];
            rhs = 0;
            for (int j = i + 1; j < array1.length; j++)
                rhs += array1[j];
            if (lhs == rhs)
                return true;
        }
        return false;
    }
}
