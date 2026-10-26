package com.mycompany.shiftingarrayelements;

/**
 * Andrew Jared N. Veracruz | BIT12
 * Enabling Assessment : Array (LAB)
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
//imports
public class ShiftingArrayElements {
    
    static void header() { //header method
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
    }
    
    static void invalidInput() throws InterruptedException{ //if input is invalid display
        System.out.println("");
        Thread.sleep(500); System.out.println("Invalid Input, Please Retry.");
        System.out.println("");
    }
    
    public static void main(String[] args) throws InterruptedException{
        Scanner arrays = new Scanner(System.in);
                
        int size = (int)(Math.random() * 50) + 1; //randomizer for array
        int[] array = new int[size]; //declare array as integer with size randomized

        for (int i = 0; i < array.length; i++) { //for loop for getting all randomized numbers (1-100) for the index(s
            array[i] = (int)(Math.random() * 100) + 1;
        }
        //variables declaration
        
        header();
        
        int choice = 0, move = 0;
        //input variable
        
        //MAIN PROGRAM
        OuterLoop:
        while (true) {
            try {
                System.out.println("");
                Thread.sleep(500); System.out.println("[1] Shift to the left\n" +
                                   "[2] Shift to the right\n" +
                                   "[3] Print array\n" +
                                   "[4] Exit. ");
                System.out.println("");
                System.out.print("Select Option >> "); //get menu choice from user
                choice = arrays.nextInt();
                System.out.println("");
                if (choice < 1 || choice > 4) { //invalid input from user
                    invalidInput();
                    continue;
                }
                int moves;
                switch (choice) { //switch to execute choice from user
                    case 1: //for loop until moves to left is done
                        Thread.sleep(500);
                        while (true) {
                            try {
                                Thread.sleep(500); System.out.print("Enter Amount of Moves >> ");
                                moves = arrays.nextInt();
                                if (moves < 1) {
                                    invalidInput();
                                }
                                else { break; }
                            } catch (InputMismatchException e) {
                                invalidInput();
                                arrays.nextLine();
                            }
                        }
                    
                        for (int j = 0; j < moves; j++) {
                            int first = array[0];
                            for (int i = 0; i < array.length - 1; i++) {
                                array[i] = array[i + 1];
                            }
                            array[array.length - 1] = first;
                        }
                    
                        Thread.sleep(500); System.out.println("Shifting elements to the left..");
                        Thread.sleep(1000); System.out.println("Current Elements of the Arrays = " + Arrays.toString(array));
                        break;

                    case 2: //for loop until moves to left is right
                        Thread.sleep(500);
                        while (true) {
                            try {
                                Thread.sleep(500); System.out.print("Enter Amount of Moves >> ");
                                moves = arrays.nextInt();
                                if (moves < 1) {
                                    invalidInput();
                                }
                                else { break; }
                            } catch (InputMismatchException e) {
                                invalidInput();
                                arrays.nextLine();
                            }
                        }
                    
                        for (int j = 0; j < moves; j++) {
                            int last = array[array.length - 1];
                            for (int i = array.length - 1; i > 0; i--) {
                                array[i] = array[i - 1];
                            }
                            array[0] = last;
                        }
                       
                    
                        Thread.sleep(500); System.out.println("Shifting elements to the Right..");
                        Thread.sleep(1000); System.out.println("Current Elements of the Arrays = " + Arrays.toString(array));
                        break;
                    case 3: //show elements of array
                        Thread.sleep(500); System.out.println("Printing Elements..");
                        Thread.sleep(1000); System.out.println("Size = " + size);
                        Thread.sleep(1000); System.out.println("Current Elements of the Arrays = " + Arrays.toString(array));
                        ///for
                        break;
                    case 4: //exit program
                        Thread.sleep(500); System.out.println("Exiting Program..");
                        break OuterLoop;
                }         
            } catch (InputMismatchException e) { //if invalid choice
                invalidInput();
                arrays.nextLine();
            }
        }
        
    }
}