package com.xgileIt.assignments.exceptions;

public class StringIndexOutOfBound {
    public void stringIndex(){
        try {
            String string = "Hello my name is Aditya singh "; //Length of string is 30
            char chartoAcess = string.charAt(34); // WE are accessing 35th element
            System.out.println(chartoAcess);
        } catch (StringIndexOutOfBoundsException thirdException) {
            System.out.println(thirdException.getMessage()+" Occured please check ");
        }
    }
}
