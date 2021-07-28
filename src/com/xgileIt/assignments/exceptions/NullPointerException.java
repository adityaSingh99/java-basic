package com.xgileIt.assignments.exceptions;

// Class for  Null Pointer Exception
public class NullPointerException {
    public void nullPointer(){

        try {
            String randomString = null; //null value
            System.out.println(randomString.charAt(0));
        }
        catch (java.lang.NullPointerException secondException){
            System.out.println(secondException.getMessage()+" Occured please check");
        }
    }
}
