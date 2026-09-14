package com.mycompany.atm_withdrawal_program;

/* 
* Andrew Jared N. Veracruz
* BIT12
* ATM Withdrawal Program
*/ 

//A program that simulates an ATM withdrawal from a payroll account.

import java.util.Scanner; //scanner import

public class Atm_withdrawal_program {

    public static void main(String[] args) throws InterruptedException{
        Scanner atm = new Scanner(System.in); //scanner
        
        double balance = 10000.00; 
        String username = "Jared";
        int passcode = 12345678;
        double withdrawal_amount;
        //initializions
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("");
        //header
    
        //INPUT
        Thread.sleep(200);
        while (true) { //loop for username input validation/check
            System.out.print("Enter Username: ");
            String username_input = atm.next().strip();
            if (username_input.equals(username)) { // if correct
                break;   
            }
            else { // if not
                System.out.println("Incorrect Username. Retry.");
            }
        }
        Thread.sleep(200);
        while (true) { //loop for passcode input validation/check
            System.out.print("Enter Passcode: ");
            int passcode_input = atm.nextInt();
            if (passcode_input == passcode) { //if correct
                break;
            }
            else { //if not
                System.out.println("Incorrect Password. Retry.");
            }
        }
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("");
        
        //INPUT w/ PROCESSING
        while (true) { //loop for withdrawal processes
            System.out.println("Your Balance: PhP" + balance); //display current balance
            System.out.println("");
            System.out.print("Enter Cash to withdraw: "); //withdraw cash
            withdrawal_amount = atm.nextDouble();
            if (withdrawal_amount > balance) { //if withdrawed is less than balance, dont accept
                Thread.sleep(800);
                System.out.println("Transaction failed. Insufficient funds");
            }
            else if (withdrawal_amount % 100 != 0) { //if withdrawed is NOT divisible by 100, dont accept
                Thread.sleep(800);
                System.out.println("Transaction failed. Amount must be divisible by 100.");
            }
            else if (withdrawal_amount <= 0) { //if withdrawed is equal or less than 0, dont accept
                Thread.sleep(800);
                System.out.println("Invalid input. Please enter a valid amount.");
            }
            else { // if withdrawed is less or equal to the balance, accept
                Thread.sleep(800);
                System.out.println("Transaction successful! Dispensing amount: PhP" +  withdrawal_amount);
                balance = balance - withdrawal_amount;
                break;
            }
        }
        
        //OUTPUT
        //Display ATM Menu Receipt
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("          A N I M O    A T M    R E C E I P T");
        System.out.println("");
        Thread.sleep(400);
        System.out.println("Hello, " + username + "!");
        Thread.sleep(800);
        System.out.println("You have successfully withdrawn: \nPHP" + withdrawal_amount);
        Thread.sleep(800);
        System.out.println("Your remaining balance is: PhP" + balance);
        Thread.sleep(800);
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("");   
    }
}
