package com.kirwa.conditions;

/**
 * ****************************
 * Created by Kirtesh Wani on 16-02-2015.
 * for JavaBasics
 * *****************************
 */
public class ConditionChecker {
    public static boolean isValidVoter(int ageOfPerson) {
        if(ageOfPerson>=18){
            return true;
        }
        else {
            return false;
        }
    }

    public static TriangleTypes getTriangleType(int angle1, int angle2, int angle3) {
        //Check if at all given angle make triangle
        if(angle1+angle2+angle3==180&&angle1>0&&angle2>0&&angle3>0){
            //check if all angles are same
            if((angle1==angle2)&&(angle1==angle3))
            {
                return TriangleTypes.EQUILATERAL;
            }
            //check if any two angle are same
            else if((angle1==angle2)||(angle1==angle3)||(angle2==angle3)){
                return TriangleTypes.ISOSCELES;
            }
            // check if any given angle is right angle means 90
            else if(angle1==90||angle2==90||angle3==90){
                return TriangleTypes.RIGHTANGLE;
            }
            else{
                return TriangleTypes.SCALENE;
            }
        }
        else{
            return TriangleTypes.NA;
        }
    }

    public enum TriangleTypes {NA, ISOSCELES, RIGHTANGLE, SCALENE, EQUILATERAL}
}
