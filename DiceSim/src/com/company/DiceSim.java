package com.company;

public class DiceSim {

    //DiceSim.java
    //Created by: Eldin Pita
    //CSCI 1302
    //Project 1
    //09/29/2020

    public static void main(String[] args) {

        // Part 1: Rolling the Dice 7776 times


        int dice[] = new int[5];
        boolean flag = true;
        int count =0;
        for(int i =0; i<7776; i++){
            flag = true;
            // roll all 5 dice
            for(int j=0; j<5; j++){
                dice[j] = (int)(Math.random()*6)+1;
                if(dice[j]>6 || dice[j]<1){
                    System.out.println("Invalid number generated.");
                    return;
                }
            }
            // Checking for yahtzee or any increments if they are available

            int temp = dice[0];
            for(int j =1; j<5; j++){
                if(dice[j]!=temp){
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
            }

        }

        System.out.println("There are "+count+" Yahtzees while rolling 5 dice for 7776 times. \n");

        //Part 2 Starts here: Checking the 2D Array

        int arr[][] = new int[5][5];

        // Adding the random numbers

        for(int i =0; i<5; i++){
            for(int j =0; j<5; j++){
                arr[i][j] = (int)(Math.random()*6)+1;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


        // Checking yahtzee
        //Rows
        int rowcount = 0;
        for(int i =0; i<5; i++){
            int temp = arr[i][0];
            if(arr[i][1] == temp && arr[i][2] == temp && arr[i][3] == temp && arr[i][4] == temp){
                rowcount++;
            }
        }

        // Columns

        int columnCount = 0;
        for(int i =0; i<5; i++){
            int temp = arr[0][i];
            if(arr[1][i] == temp && arr[2][i] == temp && arr[3][i] == temp && arr[4][i] == temp){
                columnCount++;
            }
        }

        // Diagonals

        int diagonalCount = 0;

        int temp = arr[0][0];
        if(arr[1][1] == temp && arr[2][2] == temp && arr[3][3] == temp && arr[4][4] == temp){
            diagonalCount++;
        }

        temp = arr[0][4];
        if(arr[1][3] == temp && arr[2][2] == temp && arr[3][1] == temp && arr[4][0] == temp){
            diagonalCount++;
        }

        System.out.println("Number of Yahtzees in rows : " + rowcount);
        System.out.println("Number of Yahtzees in columns : " + columnCount);
        System.out.println("Number of Yahtzees in diagonals : " + diagonalCount);
    }

}
