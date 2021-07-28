package com.xgileIt.assignments.exceptions;

public class ArhtemeticException {
    public void arthemeticException() {

        try {   // try is an keyword
            int dividend = 5;
            int divisor = 0;
            int result = dividend / divisor;
        } catch (java.lang.ArithmeticException firstException) { // Catch is a keyword
            // firstException is an object of Arithmetic exception which will be returned
            System.out.println(firstException.getMessage() + " Occured please check your code");
        }
    }
}

