package com.xgileIt.assignments.exceptions;

public class ArrayIndex_OutofBound {
    public void arrayIndexMethod(){

        try {
            int numbers[] =new int[5]; //Size of array is 5
            numbers[6] = 9; // accessing 7th element in an array of size 5
        }
        catch (ArrayIndexOutOfBoundsException sixthException){
            System.out.println(sixthException.getMessage() +"Occured please check");
        }
    }
}
