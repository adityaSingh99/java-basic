package com.xgileIt.assignments.exceptions;

public class Exception {
    public static void main(String[] args) {
        ArhtemeticException obj_ArithmeticException =new ArhtemeticException();
        obj_ArithmeticException.arthemeticException();

        NullPointerException obj_NullPointerException =new NullPointerException();
        obj_NullPointerException.nullPointer();

        StringIndexOutOfBound obj_StringIndexOutOfBound = new StringIndexOutOfBound();
        obj_StringIndexOutOfBound.stringIndex();

        File_not_Found_Exception obj_FilenotFound =new File_not_Found_Exception();
        obj_FilenotFound.filenotFound();

        NumberFormatException obj_NumberFormatException = new NumberFormatException();
        obj_NumberFormatException.numberFormatMethod();

        ArrayIndex_OutofBound obj_ArrayIndexOutofBound = new ArrayIndex_OutofBound();
        obj_ArrayIndexOutofBound.arrayIndexMethod();


    }
}

