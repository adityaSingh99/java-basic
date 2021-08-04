package com.xgileIt.assignments.logicalquestions;

import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {

        // Declaring Varialbles and initiliazing them
        int highestPeak = 0;
        int lowestValley = 0;
        int arraySize = 0;

        Scanner arraySize_scanner = new Scanner(System.in); // Declaring scanner
        System.out.println("Enter the size of your array ");
        arraySize = arraySize_scanner.nextInt();  // Sets the size of the array

        int mountain [] = new int[arraySize];

        /* For lop to enter the values in the Array */
        System.out.println("Enter the peak in the mountain");
        for (int peaksValley =0 ;peaksValley< mountain.length; peaksValley++)
        {
            mountain[peaksValley] = arraySize_scanner.nextInt();
        }

        highestPeak= mountain[0];
        lowestValley=mountain[0];

        for(int j=0;j<arraySize;j++)
        {
            if(mountain[j]>highestPeak)
                highestPeak=mountain[j];

            if(mountain[j]<lowestValley)
                lowestValley=mountain[j];
        }

        System.out.println("The Highest peak is "+highestPeak);
        System.out.println("The lowest valley is "+lowestValley);
        System.out.println("The difference between the Highest peak and Lowest valley is "+(highestPeak-lowestValley));
    }
}
