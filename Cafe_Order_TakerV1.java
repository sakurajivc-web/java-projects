package com.mycompany.cafe_order_takerv1;

/**
 * Café Order Taker: add items with prices and quantities until the customer says done, then show a receipt
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.*;
//Imports
public class Cafe_Order_TakerV1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner cafe = new Scanner(System.in);
        //Scanner initialization
        
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        //header
        
        //INPUT
        String customerName = null;
        int drinkChoice = 0, drinkQt = 0, sandwichChoice = 0, sandwichQt = 0;
        //variables from input
        
        while (true) {
            System.out.print("enter Name >> ");
            customerName = cafe.nextLine().strip();
            if (customerName.isEmpty()) {
                Thread.sleep(500);
                System.out.println("Input Error! Retry.");
                System.out.println("");
            }
            else { break; }
        }
        while (true) { //loop for drink selection
            System.out.println("====== DRINKS ======");
            Thread.sleep(500);
            System.out.println("1. Brewed Coffee   PhP 60");
            System.out.println("2. Iced Latte      PhP 95");
            System.out.println("3. Hot Chocolate   PhP 85");
            System.out.println("4. Milk Tea        PhP 80");
            System.out.println("5. Iced Tea        PhP 55");
            System.out.println("");
            try { //get input for selected drink
                System.out.print("Enter Drink Code >> ");
                drinkChoice = cafe.nextInt();
                if (drinkChoice < 1 || drinkChoice > 5) { //if invalid choice
                    Thread.sleep(500);
                    System.out.println("Input Error! Retry.");
                    System.out.println("");
                }
                else { //if valid, proceed to getting quantity
                    System.out.print("Enter Quantity >> ");
                    drinkQt = cafe.nextInt();
                    if (drinkQt < 1 || drinkQt > 100) { //if quantity is invalid
                        Thread.sleep(500);
                        System.out.println("Input Error! Retry.");
                        System.out.println("");
                    }
                    else { //if valid, end loop
                        break;
                    }
                }
            }
            catch (InputMismatchException e) { // if input is invalid
                Thread.sleep(500);
                System.out.println("Input Error! Retry.");
                System.out.println("");
                cafe.nextLine();
            }
        }
        String choice = null;
        while (true) {
            try { //Ask user if they want to add additional meal
                System.out.println("");
                Thread.sleep(500);
                System.out.print("Add a sandwich? [Y/N] >> ");
                choice = cafe.next().strip().toUpperCase();
                if (choice.equals("N") || choice.equals("NO")) { //if user picks no
                    break;
                }
                else if (choice.equals("Y") || choice.equals("YES")) { //if yes
                    while (true) { //loop for sandwhich selection
                        System.out.println("==== SANDWHICHES ====");
                        Thread.sleep(500);
                        System.out.println("1. Ham & Cheese    PhP 85");
                        System.out.println("2. Tuna Melt      PhP 95");
                        System.out.println("3. Chicken Club   PhP 110");
                        System.out.println("");
                    try { //get input for selected drink
                        System.out.print("Enter Sandwhich Code >> ");
                        sandwichChoice = cafe.nextInt();
                        if (sandwichChoice < 1 || sandwichChoice > 3) { //if invalid choice
                            Thread.sleep(500);
                            System.out.println("Input Error! Retry.");
                            System.out.println("");
                        }
                        else { //if valid, proceed to getting quantity
                            System.out.print("Enter Quantity >> ");
                            sandwichQt = cafe.nextInt();
                            if (sandwichQt < 1 || sandwichQt > 100) { //if quantity is invalid
                                Thread.sleep(500);
                                System.out.println("Input Error! Retry.");
                                System.out.println("");
                            }
                            else { //if valid, end loop
                            break;
                            }
                        }
                    }
                    catch (InputMismatchException e) { // if input is invalid
                        Thread.sleep(500);
                        System.out.println("Input Error! Retry.");
                        System.out.println("");
                        cafe.nextLine();
                        }
                    }
                    break;
                }
                else { //invalid input   
                    Thread.sleep(500);
                    System.out.println("Input Error! Retry.");
                    System.out.println("");
                }
            } 
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Input Error! Retry.");
                System.out.println("");
                cafe.nextLine();
            }
        }
        //PROCESS
        String drinkName = null, sandwichName = null;
        int drinkPrice= 0, sandwichPrice = 0, drinkTotal = 0, sandwichTotal= 0, totalPrice = 0, paidPrice = 0, change = 0;
        //determine price
        switch (drinkChoice) { //determine drink
            case 1:
                drinkPrice = 60;
                drinkName = "Brewed Coffee";
                break;
            case 2:
                drinkPrice = 95;
                drinkName = "Iced Latte";
                break;
            case 3:
                drinkPrice = 85;
                drinkName = "Hot Chocolate";
                break;    
            case 4:
                drinkPrice = 80;
                drinkName = "Milk Tea";
                break;
            case 5:
                drinkPrice = 55;
                drinkName = "Iced Tea";
                break;    
        }
        switch (sandwichChoice) { //determine sandwich
            case 1:
                sandwichPrice = 85;
                sandwichName = "Ham & Cheese";
                break;
            case 2:
                sandwichPrice = 95;
                sandwichName = "Tuna Melt";
                break;
            case 3:
                sandwichPrice = 110;
                sandwichName = "Chicken Club";
                break;     
        }
        
        drinkTotal = drinkPrice * drinkQt; 
        sandwichTotal = sandwichPrice * sandwichQt;
        totalPrice = drinkTotal + sandwichTotal;
        //determine prices
        
        //Payment
        int paidAmount = 0, changeAmount = 0;
        //payment variables
        
        while (true) { //get payment
            Thread.sleep(500);
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("");
            Thread.sleep(500);
            System.out.println("Please pay the following amount: " + totalPrice + "PhP");
            try {
                System.out.print(">> ");
                paidAmount = cafe.nextInt();
                if (paidAmount < totalPrice) {
                    Thread.sleep(500);
                    System.out.println("Input Error! Retry.");
                    System.out.println("");
                    cafe.nextLine();
                }
                else {
                    changeAmount = paidAmount - totalPrice;
                    break;
                }
            }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Input Error! Retry.");
                System.out.println("");
                cafe.nextLine();
            }
        }
        
        //OUTPUT Display Receipt
        String receipt = "======== CAFE RECEIPT ========\n\n"
        + "Customer: " + customerName + "\n\n"
        + drinkName + " x" + drinkQt + "\tPhP " + (double) drinkTotal + "\n";

        if (sandwichQt > 0) {
        receipt += sandwichName + " x" + sandwichQt + "\tPhP " + (double) sandwichTotal + "\n";
        }

        receipt += "------------------------------\n"
        + "TOTAL:\tPhP " + (double) totalPrice + "\n"
        + "PAID:\tPhP " + (double) paidAmount + "\n"
        + "CHANGE:\tPhP " + (double) changeAmount + "\n\n"
        + "Thank you, " + customerName + "!";

        JOptionPane.showMessageDialog(null, receipt, "Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
