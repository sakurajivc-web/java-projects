package com.mycompany.jeepneyfarecomputation;

//Andrew Jared N. Veracruz — BIT12

import java.util.Scanner;
//Scannner import
public class JeepneyFareComputation {

    public static void main(String[] args) throws InterruptedException{
        Scanner compute = new Scanner(System.in);
        //scanner
        
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("");
        //header
        
        boolean is_stud_or_sen = false;
        double minimum_fare = 13.0;
        double per_km_rate = 2.0;
        double minimum_distance = 4;
        double discount = 0;
        double final_fare = 0;
        
        //initialized data
       
        //INPUT
        System.out.print("Enter Distanced Travel: ");
        int distance_traveled = compute.nextInt();
        //get distanced travaled
        
        //PROCESSING
        if (distance_traveled <= 0) { //if negative input
            System.out.println("Invalid input."); 
        }
        else { //if input is positive
            System.out.print("Is the passenger a student or senior citizen?: ");
            is_stud_or_sen = compute.nextBoolean(); 
            //is the user a student or a senior citizen? 
            if (is_stud_or_sen != true && is_stud_or_sen != false) { // if the input is invalid
                System.out.println("Invalid input.");
            }
            else if (is_stud_or_sen == true) { //Computations if input is valid and user is a student/senior
                double gross_total = (minimum_fare + (per_km_rate * (distance_traveled - minimum_distance)));
                if (gross_total < minimum_fare) { gross_total = minimum_fare; }
                discount = gross_total * 0.20;
                final_fare = gross_total - discount;
                
            }
            else { //Computations if input is valid and user is NOT a student/senior
                final_fare = (minimum_fare + (per_km_rate * (distance_traveled - minimum_distance)));
            }
        }
        
        //OUTPUT
        if (distance_traveled >= 0) { //if input is valid, proceed with output
            if (is_stud_or_sen == true || is_stud_or_sen == false) { //if input is valid, proceed with output
                System.out.println("");
                System.out.println("===============================================");
                System.out.println(""); 
                Thread.sleep(1000);
                System.out.println("Distance Traveled: " + distance_traveled + "km");
                Thread.sleep(1000);
                System.out.println("Original Fare: PhP" + (minimum_fare + (per_km_rate * (distance_traveled - minimum_distance))));
                Thread.sleep(1000);
                System.out.println("Discount: PhP" + discount);
                Thread.sleep(1000);
                System.out.println("Final Fare: PhP" + final_fare);
                Thread.sleep(1000);
            }
        }
        System.out.println("");
        System.out.println("===============================================");
        System.out.println(""); 
    }
}