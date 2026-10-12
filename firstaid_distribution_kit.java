package com.mycompany.firstaid_distribution_kit;

/*
* Andrew Jared N. Veracruz â€” BIT12
* Ma'am Sherry Naz
* Enabling Assessment : First Aid Kit Distribution Tracker
*/

import java.util.Scanner;
import java.util.InputMismatchException;
//imports
public class firstaid_distribution_kit {

    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in); //scanner for inputs
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        //header universal
        
        int numHousehold = 0;
        String scQ= null, pwdQ = null, low_incQ = null;
        //input variables
        
        while (true) { //loop for input validation on number of households
            try {
                System.out.print("Enter Number of House Holds: ");
                numHousehold = console.nextInt();
                if (numHousehold < 1) { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
                }
                else { break; } //if valid
            }
            catch (InputMismatchException e) { //if input is String, invalid
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                console.nextLine();
            }
        }
        
        int baseKit = 1;
        int totalKit = 0;
        //process variables
        //loop for every householod input
        for (int i = 1; i <= numHousehold; i++){
            int allocatedKits = baseKit;
            int householdNo = 1;
            System.out.println("");
            System.out.println("Household " + i + ":");
            while (true) { //loop for getting amount of family members
                try {
                System.out.print("Enter Number of Family Members: ");
                int famMembers = console.nextInt();
                if (famMembers < 1) { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
                }
                else { break; } //if valid
            }
            catch (InputMismatchException e) { //if input is String, invalid
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                console.nextLine();
                }
            }
            while (true) { //loop for checking if household has Senior Citizen
                System.out.print("Has senior citizen [Y/N]? "); //input
                scQ = console.next().strip().toUpperCase();
                if (scQ.equals("Y") || scQ.equals("YES")) { //if yes, add 1 to total kit
                    allocatedKits ++;
                    break;
                }
                else if (scQ.equals("N") || scQ.equals("NO")) { //if no
                    break;
                }
                else { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry."); 
                    System.out.println("");
                }   
            }
            while (true) { //loop for checking if household has PWD
                System.out.print("Has PWD [Y/N]? "); //input
                pwdQ = console.next().strip().toUpperCase();
                if (pwdQ.equals("Y") || pwdQ.equals("YES")) { //if yes, add 1 to total kit
                    allocatedKits ++;
                    break;
                }
                else if (pwdQ.equals("N") || pwdQ.equals("NO")) { //if no
                    break;
                }
                else { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry."); 
                    System.out.println("");
                }   
            }
            while (true) { //loop for checking if household is a low-income family
                System.out.print("Is low-income[Y/N]? "); //input
                low_incQ = console.next().strip().toUpperCase();
                if (low_incQ.equals("Y") || low_incQ.equals("YES")) { //if yes, add 1 to total kit
                    allocatedKits ++;
                    break;
                }
                else if (low_incQ.equals("N") || low_incQ.equals("NO")) { //if no
                    break;
                }
                else { //if input is invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry."); 
                    System.out.println("");
                }   
            }
            totalKit += allocatedKits;
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Number of Kits allocated: " + allocatedKits); //show allocated kits per household
        }
        
        //OUTPUT
        Thread.sleep(500);
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("Total first aid kits distributed: " + totalKit);
        Thread.sleep(500);
        System.out.println("Average kits per household: " + ((float)totalKit / numHousehold));
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");    

    }
}