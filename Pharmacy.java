package com.mycompany.pharmacy;

/**
 * Andrew Jared N. Veracruz - BIT12
 * Enabling Assessment : Pharmacy
 */

//Enabling Assessment : Pharmacy
import java.util.Scanner; //import scanner
import java.util.InputMismatchException; // import for input validation

public class Pharmacy {

    public static void main(String[] args) throws InterruptedException {
        Scanner pharmacy = new Scanner(System.in); //scanner
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        //header
        
        String customer_name;
        int customer_age;
        double purchase_amount;
        
        //INPUT
        OuterLoop:
        while (true) { //Main loop for input
            while (true) { //loop for customer name input
                Thread.sleep(500);
                System.out.print("Enter Customer Name: ");
                customer_name = pharmacy.nextLine().strip(); //get customer name
                if (customer_name == "") { //if invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Retry");
                }
                else { break; } //if valid
            }
            while (true) { //loop for customer age input
                try {
                    Thread.sleep(400);
                    System.out.print("Enter Age: "); 
                    customer_age = pharmacy.nextInt(); //get customer age
                    if (customer_age <= 0 || customer_age > 150) { //if invalid age
                        Thread.sleep(500);
                        System.out.println("Invalid Input. Retry");
                    } 
                    else { break; } //if valid age
                }
                catch (InputMismatchException e) { //if invalid input (letters)
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Retry");
                } pharmacy.nextLine();
            }
            while (true) { //loop for purchase amount
                try {
                    Thread.sleep(400);
                    System.out.print("Enter Purchase Amount (PhP): ");
                    purchase_amount = pharmacy.nextInt(); //get purchase amount
                    if (purchase_amount <= 0) { //if the purchase amount is invalid / less than 0
                        Thread.sleep(500);
                        System.out.println("Invalid Input. Retry");
                    }
                    else { break OuterLoop; } //if valid purchase amount input
                }
                catch (InputMismatchException e) { //if invalid purchase invalid
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Retry");
                }
            }
        }
        
        //PROCESSING
        double discount_rate, rebate, final_amount;
        String addon_benefit = null, discount;
        //declare variables
        
        
        if (customer_age >= 60) { //if senior citizen assign thse variables
            discount_rate = 0.80;
            discount = "20%";
            if (purchase_amount > 1000) { //if purchase greater than 1000
                rebate = 0;
            }
            else { rebate = 0; } //if not
        }
        else { //if not senior citizen 
            discount_rate = 1;
            discount = "None";
            if (purchase_amount > 1500) { //if purchase greater than 1500
                rebate = 50;
            }
            else { //if not
                rebate = 0;
            }
        }
        
        //calculations
        final_amount = (purchase_amount * discount_rate) - rebate; //compute final_amount
        if (customer_age >= 60) {
            //determine additonal benefits based on final amount
            if (final_amount > 1000)
                addon_benefit = "Free Multivitamin";
            else { addon_benefit = "None"; }
        }
        else { 
            if (final_amount > 1500) {
                addon_benefit = "50 PhP Rebate"; 
            }
            else if (final_amount <= 1500) { 
                addon_benefit = "None"; 
            } 
        }

        //OUTPUT
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("Customer: " + customer_name);
        Thread.sleep(500);
        System.out.println("Discount Rate: " + discount);
        Thread.sleep(500);
        if (customer_age >= 60) {
            System.out.println("Discount Applied: PhP " + purchase_amount * 0.2);
        }
        else {
            System.out.println("Discount Applied: PhP 0" );
        }
        Thread.sleep(500);
        System.out.println("Additional Benefit: " + addon_benefit);
        Thread.sleep(500);
        System.out.println("Final Amount Paid: PhP " + final_amount);
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
    }
}