package com.xgileIt.assignments.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_not_Found_Exception {
    public void filenotFound() {
        try {
            // Creating a new file which is not present in system
            File file = new File("E//file.txt");
            // Creating object of file reader
            FileReader reader = new FileReader("file.txt");
        }
        catch (FileNotFoundException fourthException) {
            System.out.println(fourthException.getMessage()+" Occured please check");
        }
    }
}
