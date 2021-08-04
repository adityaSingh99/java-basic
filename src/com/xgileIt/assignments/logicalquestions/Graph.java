package com.xgileIt.assignments.logicalquestions;

import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {

        int rise = 0;
        int fall = 0;

        Scanner pointsScanner = new Scanner(System.in);
        System.out.println("Enter the size of List");
        int listSize = pointsScanner.nextInt();

        int graph [] = new int [listSize];

        //Loop to enter the value into the array
        System.out.println("Enter the points in a graph");
        for (int points=0 ; points<graph.length; points++){
            graph[points] = pointsScanner.nextInt();
        }

        for(int i=0 ; i<listSize-1 ;i++)
        {
            if (graph [i] < graph [i+1]){
                rise++;
            } else if (graph [i] > graph [i+1] ) {
                fall++;
            }
            }

        System.out.println("The Total number of fall :" +fall);
        System.out.println("The Total number of rise :" +rise);
            }
        }


