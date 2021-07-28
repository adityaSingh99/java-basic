package com.xgileIt.assignments.exceptions;

public class NumberFormatException {
    public void numberFormatMethod (){
        try {
            int anyNumber = Integer.parseInt(null);
            System.out.println(anyNumber);
        }
        catch(java.lang.NumberFormatException fifthException){
            System.out.println(fifthException.getMessage()+" Occured please check");
        }
    }
}
