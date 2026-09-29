package com.mycompany.network_device_status_v1;

//AJV - practice project #1 for lab exam

import java.util.Scanner;
import java.util.InputMismatchException;
//imports

public class Network_device_status_v1 {

    public static void main(String[] args) throws InterruptedException{
        Scanner network = new Scanner(System.in); //scanner for input
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        //header
        
        int userChoice = 0;
        String deviceStatus = null; 
        
        //INPUT
        Thread.sleep(200);
        System.out.println("Devices:");
        System.out.println("[1] - Router");
        System.out.println("[2] - Switch");
        System.out.println("[3] - Access Point");
        System.out.println("");
        
        while (true) { //get type pf device
            try {
               Thread.sleep(500);
               System.out.print("Select Device: ");
               userChoice = network.nextInt();
               if (userChoice < 1 || userChoice > 3) {
                   Thread.sleep(500);
                   System.out.println("Invalid Input. Please retry.");
                   System.out.println("");
               }
               else { break; }
            }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
            } network.nextLine();
        }
        while (true) { //get type pf device
               Thread.sleep(500);
               System.out.print("Enter Device Status (online/offline): ");
               deviceStatus = network.next().strip().toUpperCase();
               if (deviceStatus.equals("ONLINE") || deviceStatus.equals("OFFLINE")) { break; }
               else {
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
               }
            }     
        //PROCESSING
        String device = null; // variable
        
        switch (userChoice) {
            case 1:
                device = "Router";
                break;
            case 2:
                device = "Switch";
                break;
            case 3:
                device = "Access Point";
                break;
        }
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        System.out.print(device + " Status: ");
        if (deviceStatus.equals("ONLINE")) {
            System.out.println("Operating normally.");
        }
        else {
            System.out.println("Not operating.");
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
    }
}
