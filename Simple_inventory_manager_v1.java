package com.mycompany.simple_inventory_manager_v1;

/**
 *
 * @author Andrew Jared
 */

//Project — Simple Inventory Manager

/*
Setup
Track a single item's stock count with the option to check, add, or remove.
*/

import java.util.Scanner;
import java.util.Random;
//imports

public class Simple_inventory_manager_v1 {

    public static void main(String[] args) throws InterruptedException{
        Scanner inventory = new Scanner(System.in); //scanner
        Random rand = new Random(); //randomizer for int
        
        int stocks = rand.nextInt(50) + 1; // stocks amount from 1 to 100 initialized
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        //header
        
        OuterLoop:
        while (true) {
            System.out.println("[1] Check Stock\n" +
"[2] Add Stock\n" +
"[3] Remove Stock\n" +
"[4] Exit");
            Thread.sleep(500);
            System.out.println("");
            System.out.print("Enter input: ");
            int choice = inventory.nextInt();
            
            switch (choice) { //Menu
                case 1: //display current stocks
                    System.out.println("Current Stocks: " + stocks);
                    System.out.println("");
                    break;
                    
                case 2:
                    while (true) { //add more stocks
                        if (stocks == 100) { //if stocks max
                        System.out.println("Unable to add more stocks.");
                        System.out.println("");
                        break;
                        }
                        else if (stocks < 100 || stocks >= 1) { //if stocks less than 100 
                        System.out.print("(total stocks must not exceed 100 / input should be > 0)\nEnter amount to add: ");
                        int stocks_added = inventory.nextInt(); //get stocks to add
                        System.out.println("");
                            if (stocks_added <= 0 || stocks_added + stocks > 100) { //if max stocks when added or not more than 0
                                System.out.println("Invalid Input. Retry.");
                                System.out.println("");
                            }
                            else { //if okay, add stocks
                                System.out.println("Successfully added: " + stocks_added);
                                stocks = stocks_added + stocks;
                                System.out.println("New Stocks: " + stocks);
                                System.out.println("");
                            break;
                            }
                        }    
                    }
                    break;
                    
                case 3:
                    while (true) { //remove stocks
                        if (stocks == 0) { //if stocks is equal to 0, user can't remove any
                            System.out.println("Unable to remove more stocks.");
                            System.out.println("");
                            break;
                            }
                            else if (stocks < 100 || stocks >= 1) { //if max stocks when added or not more than 0
                            System.out.print("(total stocks removed should be valid / total stocks should be >= 0)\nEnter amount to removed: ");
                            int stocks_removed = inventory.nextInt(); //get stocks to remove
                            System.out.println("");
                                if (stocks_removed <= 0 || stocks - stocks_removed <= 0) { //if stocks when removed exceed 0 or stocks greater than 0
                                    System.out.println("Invalid Input. Retry.");
                                    System.out.println("");
                            }
                                else { //if okay, remove stocks
                                    System.out.println("Successfully removed: " + stocks_removed);
                                    stocks =  stocks - stocks_removed;
                                    System.out.println("New Stocks: " + stocks);
                                    System.out.println("");
                                    break;
                            }
                        }
                    }
                    break;
                    
                case 4: //exit the menu
                    System.out.println("Exiting inventory system.");
                    break OuterLoop;
                    
                default: //if incorrect menu input
                    System.out.println("Invalid menu choice.");
                    break;
            }             
        }
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        
    }
}
