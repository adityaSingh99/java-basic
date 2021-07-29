/*package com.xgileIt.assignments.logicalquestions;

import java.util.Scanner;

public class Numberof_DaysLived {
    public static void main(String[] args) {

        Scanner forDOB = new Scanner(System.in);
        System.out.println("Please enter the day you were born");
        int day = forDOB.nextInt();
        System.out.println("Please enter the month you were born");
        int month = forDOB.nextInt();
        System.out.println("Please enter the year of your birth");

        int year = forDOB.nextInt();

        if (year % 4 == 0) {
            System.out.println("You were born in a leap Year");
        }
        else {
            System.out.println("You were not born in an leap year");
        }
        Scanner forPresentdate = new Scanner(System.in);
        System.out.println("Enter the present day");
        int presentDay = forPresentdate.nextInt();
        System.out.println("Enter the present month");
        int presentMonth = forPresentdate.nextInt();
        System.out.println("Enter the current year");
        int presentYear = forPresentdate.nextInt();

        int age = (presentYear - 1) - year;
        int leapYears_lived = Math.floorDiv(age, 4);
        int numberofDaysLived ;

        if (day == presentDay && month == presentMonth) {
            numberofDaysLived = (age * 365) + leapYears_lived + 365;
        }
        else if (presentDay >day && presentMonth > month){
            numberofDaysLived = (age * 365) + leapYears_lived + presentMonth + presentDay;
        }
        else if (presentDay < day && presentMonth < month){
           numberofDaysLived = (age * 365) + leapYears_lived + month + day + presentDay;
        }
        else{
            System.out.println("Sorry an error occurred");
        }
        System.out.println("Your age is "+age);
        System.out.println("The total number of days you have lived is "+numberofDaysLived);
    }
}*/
