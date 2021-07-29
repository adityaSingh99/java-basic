package com.xgileIt.assignments.logicalquestions;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a String to reverse");

        String name = str.nextLine();
        char string[] = name.toCharArray();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(string[i]);
        }

    }
}
