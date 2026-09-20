/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cpu_temperature_checker;

/**
 *
 * @author Andrew Jared
 */

//Program asks the user for their CPU temperature and determine its status.

import java.util.Scanner; //scanner import
import java.util.InputMismatchException; //for input checking

public class Cpu_temperature_checker {

    public static void main(String[] args) throws InterruptedException{
        Scanner checker = new Scanner(System.in); //scanner
        double temperature_input; //initalize
        
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        //header
        
        //INPUT
        while (true) {
                try {
                    System.out.print("Enter CPU temperature (C): "); 
                    temperature_input = checker.nextInt(); //get temp from user
                    if (temperature_input < 0 || temperature_input > 120) { //if not in valid range
                        Thread.sleep(500);
                        System.out.println("Invalid Input! Please enter a valid number.");
                    }
                    else { //if in valid range
                        break;
                    }
                }  
                catch (InputMismatchException e) { //if input is not a number
                    Thread.sleep(500);
                    System.out.println("Invalid Input! Please enter a valid number.");
                    checker.nextLine();
                }
                
        }
        
        //PROCESSING
        String message, fan_reco; //variables initialization
        
        //check temperature
        if (temperature_input < 40) {
            message = "CPU is running cool.";
            fan_reco = "Fan: Low";
        }
        else if (temperature_input <= 69) {
            message = "CPU temperature is normal.";
            fan_reco = "Fan: Normal";
        }
        else if (temperature_input <= 84) {
            message = "CPU temperature is getting high.";
            fan_reco = "Fan: High";
        }
        else {
            message = "WARNING: CPU temperature is too high!";
            fan_reco = "Fan: Maximum";
        }
        
        //OUTPUT
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        Thread.sleep(500);
        System.out.printf("CPU temperaturez: %.2f C", temperature_input);
        System.out.println("");
        Thread.sleep(500);
        System.out.println("Status: " + message);
        Thread.sleep(500);
        System.out.println(fan_reco);
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
    }
}
