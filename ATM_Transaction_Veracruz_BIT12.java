package com.mycompany.atm_transaction_veracruz_bit12;

/**
 *  Andrew Jared N. Veracruz â€” BIT12
 *  While Loop Programming Problem: ATM Transaction 
 */

import java.util.Scanner;
import java.util.InputMismatchException;
//imports
public class ATM_Transaction_Veracruz_BIT12 {

    public static void main(String[] args) throws InterruptedException{
        Scanner atm = new Scanner(System.in); //scanner initialization
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        Thread.sleep(500);
        //header
        
        double userBalance = 67000, deposit = 0, withdraw = 0;
        int atmChoice = 0; 
        String username = "Andrew Jared";
        //variables
        
        //LOOP FOR ATM
        OuterLoop:
        while (true) { //main loop
            while (true) { //loop for ATM Transactions
                try { //user picks a choice from the menu
                    Thread.sleep(500);
                    System.out.println("Welcome to AnimoBank!");
                    Thread.sleep(500);
                    System.out.println("Choose a transaction");
                    System.out.println("1\t- Inquire");
                    System.out.println("2\t- Deposit");
                    System.out.println("3\t- Withdraw");
                    System.out.println("4\t- Exit");
                    System.out.print(">> ");
                    atmChoice = atm.nextInt();
                    if (atmChoice < 1 || atmChoice > 4) { //if choice is invalid
                        Thread.sleep(500);
                        System.out.println("Invalid Input. please retry.");
                        System.out.println("");
                    }
                    else { //if valid
                        break;
                    }
                }
                catch (InputMismatchException e) { //if invalid characters are entered
                    Thread.sleep(500);
                    System.out.println("Invalid Input. please retry.");
                    System.out.println("");
                    atm.nextLine();    
                }
            }
            switch (atmChoice) { //different cases for the options
                case 1: //display balance
                    Thread.sleep(500);
                    System.out.println("Current balance is : " + "PhP" + userBalance);
                    System.out.println("");
                    break;
                case 2: //user adds to balance
                    Thread.sleep(500);
                    try {
                        System.out.print("Enter amount to deposit >> "); //get deposit amount from user
                        deposit = atm.nextDouble();
                        if (deposit < 1) { //input is invalid
                            Thread.sleep(500);
                            System.out.println("Invalid Input. please retry.");
                            System.out.println("");
                            break;
                        }
                        else { //if valid, perform transaction
                            userBalance = userBalance + deposit; 
                            Thread.sleep(500);
                            System.out.println("Transaction succeeded.");
                            Thread.sleep(500);
                            System.out.println("Current balance is : " + "PhP" + userBalance);
                            System.out.println("");
                            break;
                        }   
                    }
                    catch (InputMismatchException e) { //if invalid characters are entered
                    Thread.sleep(500);
                    System.out.println("Invalid Input. please retry.");
                    System.out.println("");
                    atm.nextLine();
                    break;
                }
                case 3: //user subtracts to balance
                    Thread.sleep(500);
                    try {
                        System.out.print("Enter amount to withdraw >> "); //get withdraw amount from user
                        withdraw = atm.nextDouble();
                        if (withdraw < 1) { //input is invalid
                            Thread.sleep(500);
                            System.out.println("Invalid Input. please retry.");
                            System.out.println("");
                            break;
                        }
                        else if (withdraw < userBalance) {
                            Thread.sleep(500);
                            System.out.println("Invalid Input. Withdraw exceeds current balance. Please retry.");
                            System.out.println("");
                            atm.nextLine();
                    break;
                        }
                        else { //if valid, perform transaction
                            userBalance = userBalance - withdraw;
                            Thread.sleep(500);
                            System.out.println("Transaction succeeded.");
                            Thread.sleep(500);
                            System.out.println("Current balance is : " + "PhP" + userBalance);
                            System.out.println("");
                            break;
                        }   
                    }
                    catch (InputMismatchException e) { //if invalid characters are entered
                    Thread.sleep(500);
                    System.out.println("Invalid Input. please retry.");
                    System.out.println("");
                    atm.nextLine();
                    break;
                } 
                case 4: //exit program
                    break OuterLoop;
            }
            try { //ask user if they wanna try another transaction
                System.out.print("Perform another transaction [Y/N] >> "); //ask user if they wanna do another transaction
                String choice = atm.next().strip().toLowerCase();
                if (choice.equals("yes") || choice.equals("y")) {
                    Thread.sleep(500);
                    System.out.println("...");
                    System.out.println("");
                    continue OuterLoop;
                }
                else if (choice.equals("no") || choice.equals("n")) { //end program
                    Thread.sleep(500);
                    break OuterLoop;
                }
                else { //if input isn't no or yes
                    Thread.sleep(500);
                    System.out.println("Invalid Input. please retry.");
                    System.out.println("");
                }
            }
            catch (InputMismatchException e) { //if invalid characters are entered
                Thread.sleep(500);
                System.out.println("Invalid Input. please retry.");
                System.out.println("");
                atm.nextLine();
            }   
            
        }
        //End of the Program
        System.out.println("");
        System.out.println("Thank you for banking with us, " + username + ".");
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");   
    }
}