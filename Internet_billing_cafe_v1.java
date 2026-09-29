package com.mycompany.internet_billing_cafe_v1;

//AJV - practice project #1 for lab exam

import java.util.Scanner;
import java.util.InputMismatchException;
//imports

public class Internet_billing_cafe_v1 {

    public static void main(String[] args) throws InterruptedException{
    Scanner int_cafe = new Scanner(System.in); //for getting input
    
    System.out.println("");
    System.out.println("=======================================");
    System.out.println("");
    //header
    
    int hours_used;
    String status;
    double discount_rate;
    
    //INPUT
    while (true) { //get hours spent from user
        try {
            Thread.sleep(500);
            System.out.print("Enter hours used [1-12]: ");
            hours_used = int_cafe.nextInt();
            if (hours_used < 1 || hours_used > 12) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please Retry.");
                System.out.println("");
            }
            else { break; }
        }
        catch (InputMismatchException e) {
            Thread.sleep(500);
            System.out.println("Invalid Input. Please Retry.");
            System.out.println("");   
        } int_cafe.nextLine();
    }
    
     while (true) { //check if user's a student
            Thread.sleep(500);
            System.out.print("Are you a student? [yes/no]: ");
            status = int_cafe.next().strip().toUpperCase();
            if (status.equals("YES") || status.equals("Y")) { //if student
                discount_rate = 0.8;
                break;
            }
            else if (status.equals("NO") || status.equals("N")) { //if not student
                discount_rate = 1;
                break;
            }
            else {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please Retry.");
                System.out.println("");
            } //invalid input
    }
    
    //PROCESSING
    int rate_perHour = 30; //hourly rate
    double total_bill = (hours_used * rate_perHour) * discount_rate; //calculate total bill
    
    //OUTPUT
    System.out.println("Total bill: PhP" + total_bill);
    System.out.println("");
    System.out.println("=======================================");
    System.out.println("");
    
    }
}
