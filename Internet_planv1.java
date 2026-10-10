package com.mycompany.internet_planv1;

//A simple program that calculates a user's remaining mobile data allowance based on their selected internet plan and data consumption.

import java.util.Scanner;
import java.util.InputMismatchException;
//imports

public class Internet_planv1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner isp = new Scanner(System.in); //initialization of scanner
        
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
        //header
        
        System.out.println("[1] 5 GB\n" +
                            "[2] 10 GB\n" +
                            "[3] 20 GB"); //options for internet plan
        //INPUT
        
        int choice = 0;
        float dataConsumed = 0;
        //variables input
        while (true) {  //loop for internet plan
            try {
                Thread.sleep(500);
                System.out.print("Enter Internet Plan: "); //get input
                choice = isp.nextInt();
                if (choice < 1 || choice > 3) { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please Retry.");
                    System.out.println("");
                }
                else { break; } //if valid input
            }
            catch (InputMismatchException e) { //if invalid character
                Thread.sleep(500);
                System.out.println("Invalid Input. Please Retry.");
                System.out.println("");
            }
        }
        
        while (true) {  //loop for amount of consumed data
            try {
                Thread.sleep(500);
                System.out.print("Enter data consumed (GB): "); //get input
                dataConsumed = isp.nextFloat();
                if (dataConsumed < 0 || dataConsumed > 100) { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please Retry.");
                    System.out.println("");
                }
                else { break; } //if valid input
            }
            catch (InputMismatchException e) { //if invalid character
                Thread.sleep(500);
                System.out.println("Invalid Input. Please Retry.");
                System.out.println("");
            }
        }
        
        //PROCESSING
        float internetPlan = 0;
        
        //variables
        
        switch (choice)  { //determine internet plan based on choice
            case 1:
                internetPlan = 5;
                break;
            case 2:
                internetPlan = 10;
                break;
            case 3:
                internetPlan = 20;
                break;
        }
        
        //compute remaining data
        float remainingData = internetPlan - dataConsumed;
        String status;
        float excessUsage = 0;
        
        //determine status based from remaining data
        if (remainingData < 0) {
            status = "Data Limit Exceeded";
        }
        else if (remainingData == 0) {
            status = "Data Limit Reached";
        }
        else if (remainingData < 1) {
            status = "Data Near Limit";
        }
        else {
            status = "Data Available";
        }
        
        if (remainingData < 0) {
            excessUsage = remainingData * -1;
        }
        else { excessUsage = 0; }
        
        //OUTPUT
        Thread.sleep(500);
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("Internet Plan: " + internetPlan + " GB");
        System.out.println("Data Consumed: " + dataConsumed + " GB");
        System.out.println("Remaining Data: " + remainingData + " GB");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("Status:"  + status);     
        System.out.println("Excess Usage: " + excessUsage + " GB");
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
    }
}