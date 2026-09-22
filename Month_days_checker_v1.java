package com.mycompany.month_days_checker_v1;

//Challenger activity given by Ma'am Sherry

//A program that accepts month number and displays the number of days in that month. Assume that the year is not a leap year.

import java.util.Scanner;
import java.util.InputMismatchException;
//imports
public class Month_days_checker_v1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner calendar = new Scanner(System.in); //scanner
        
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
        //header
        
        //INPUT
        int month_input;
        
        while (true) { //Loop for input
            try {
                Thread.sleep(500);
                System.out.print("Enter Month Number: ");
                month_input = calendar.nextInt(); //get the Month
                if (month_input < 1 || month_input > 12) { //if input is not valid
                    Thread.sleep(500);
                    System.out.println("Invalid Input, Please Retry.");
                    System.out.println("");
                }
                else { break; } //if valid
            }
            catch (InputMismatchException e) { //if input is not valid
                Thread.sleep(500);
                System.out.println("Invalid Input, Please Retry.");
                System.out.println("");
            } calendar.nextLine();
        }
        
        //PROCESS
        String month = null;
        int days = 0;
        
        switch (month_input) { //check which month and amount of days
            case 1:
                month = "January";
                days = 31;
                break;
            case 2:
                month = "February";
                days = 28;
                break;
            case 3:
                month = "March";
                days = 31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "July";
                days = 31;
                break;   
            case 8:
                month = "August";
                days = 30;
                break;    
            case 9:
                month = "September";
                days = 31;
                break;     
            case 10:
                month = "October";
                days = 30;
                break;     
            case 11:
                month = "November";
                days = 31;
                break; 
            case 12:
                month = "December";
                days = 30;
                break;
        }
        
        //OUTPUT
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
        System.out.println("Month: " + month);
        System.out.println("Amount of Days: " + days);
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
    }
}
