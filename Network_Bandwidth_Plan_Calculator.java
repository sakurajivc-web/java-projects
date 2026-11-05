package com.mycompany.network_bandwidth_plan_calculator;

// A simple bandwidth allocation calculator for an Internet Service Provider (ISP)

import java.util.Scanner;
import java.util.InputMismatchException;

//imports
public class Network_Bandwidth_Plan_Calculator {
    
    static void header() { //header //utilities
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
    }
    
    static void invalidInput() throws InterruptedException { //display if input is invalid //utilities
        Thread.sleep(500);
        System.out.println("");
        System.out.println("Invalid input. Please retry.");
        System.out.println("");
    }
    
   static void availablePlans() throws InterruptedException { //display plans //utilities
        Thread.sleep(500);
        System.out.println("");
        System.out.println("Available Plans:\n" +
                            "[1] Fiber 50 Mbps\n" +
                            "[2] Fiber 100 Mbps\n" +
                            "[3] Fiber 200 Mbps");
        System.out.println("");
   }
   
   //INPUT
   static int getSelectedPlan() throws InterruptedException { //get plan from user input
       Scanner console = new Scanner(System.in); //scanner initialization
       
       System.out.println("Network Bandwidth Plan Calculator");
       header();
       availablePlans();
       while (true) { //loop for getting selected plan from user
           try {
               System.out.print("Select Plan >> "); 
               int selectedPlan = console.nextInt(); //user inputs plan num
               if (selectedPlan < 1 || selectedPlan > 3) { //if invalid plan number
                  invalidInput();
               } else { //return the value if it's valid
                   return selectedPlan;
               }
           } catch (InputMismatchException e) { //if input from user is an invalid character
               invalidInput();
               console.nextLine();
           }    
       }
   }
    
    static int getDeviceAmount() throws InterruptedException { //get amount of devices from user input
       Scanner console = new Scanner(System.in); //scanner initialization
       
       header();
       while (true) { //loop for getting device amount from user
           try {
               System.out.print("Enter Amount of Devices >> "); 
               int deviceAmount = console.nextInt(); //user inputs plan num
               if (deviceAmount < 1 || deviceAmount > 50) { //if invalid plan number
                  invalidInput();
               } else { //return the value if it's valid
                   return deviceAmount;
               }
           } catch (InputMismatchException e) { //if input from user is an invalid character
               invalidInput();
               console.nextLine();
           }    
       }
   }
   //PROCESSING
    static int determinePlanSpeed(int selectedPlan) { //method for determining the speed of the plan
        return switch (selectedPlan) {
            case 1 -> 50;
            case 2 -> 100;
            case 3 -> 200;
            default -> 0;
        };
   }
   
   static double computeBandwidth(int planSpeed, int deviceAmount) { //computes the average between per device
       double avgBandwidth = planSpeed / deviceAmount;
       return avgBandwidth;
   }
   
   static String checkNetCapacity(double avgBandwidth) { //check network capacity based on avg bandwidth per device
       if (avgBandwidth < 5) {
           return "Insufficient";
       } else if (avgBandwidth < 15) {
           return "Limited";
       }
       else {
           return "Sufficient";
       }
   }
   
   //OUTPUT
   static void displayResult(int deviceAmount, int planSpeed, double avgBandwidth, String netCapacity) throws InterruptedException{ //display results
       Thread.sleep(500);
       header();
       System.out.println("Selected Plan: " + planSpeed + " Mbps"); Thread.sleep(500);
       System.out.println("Connected Devices: " + deviceAmount); Thread.sleep(500);
       System.out.println("Average Bandwidth: " + avgBandwidth + " Mbps/device"); Thread.sleep(500);
       System.out.println("Network Capacity: " + netCapacity); Thread.sleep(500);
       header();
       
   }
   
   static boolean returnMenu() throws InterruptedException { //get answer if user ewants to try again or no
       Scanner console = new Scanner(System.in); //scanner initialization
       while (true) { //loop for getting user's input
           System.out.println("Would you like to try again? [Y/N]");
           Thread.sleep(500);
           System.out.print(">> ");
           String choice = console.next().strip().toLowerCase();
           if (choice.equals("y") || choice.equals("yes")) {
               return true;
           } else if (choice.equals("n") || choice.equals("no")){
               return false;
           }
           else { invalidInput(); }
       }
   }
   //Method MANAGER
   static void manager() throws InterruptedException { //all methods called out here
       header();
       int selectedPlan = getSelectedPlan();
       int deviceAmount = getDeviceAmount();
       int planSpeed = determinePlanSpeed(selectedPlan);
       double avgBandwidth = computeBandwidth(planSpeed, deviceAmount);
       String netCapacity = checkNetCapacity(avgBandwidth);
       
       displayResult(deviceAmount, planSpeed, avgBandwidth, netCapacity);
   }
   
   //MAIN PROGRAM
   public static void main(String[] args) throws InterruptedException {
       while (true) { //if user wants to repeat, restart program, otherwise exit
           manager();
           if (returnMenu() != (true)) {
               break;
       } 
    }
           header();
           Thread.sleep(500);
           System.out.println("Thank you for using our tool!");
           header();
    }
}
