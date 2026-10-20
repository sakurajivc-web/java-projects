package com.mycompany.bottle_recycling_veracruz_bit12;

/**
 *  Andrew Jared N. Veracruz - BIT12
 *  Plastic Bottle Recycling - LEC EA
 */

import java.util.Scanner;
import java.util.InputMismatchException;
//imports
public class Bottle_Recycling_Veracruz_BIT12 {

    public static void main(String[] args) throws InterruptedException{
        Scanner recycle = new Scanner(System.in); //scanner initialization
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        Thread.sleep(500);
        //header
        
        int bottles = 0, totalBottles = 0, visit = 0;
        //variables
        
        //LOOP FOR RECYCLING
        OuterLoop:
        while (true) { //main loop
            totalBottles = 0;
            visit = 0;
            //reset values for a new coupon
            
            Thread.sleep(500);
            System.out.println("Welcome to the Community Recycling Center!");
            Thread.sleep(500);
            System.out.println("Recycle 50 bottles to earn a reward coupon.");
            System.out.println("");
            
            while (totalBottles < 50) { //loop for bottle input
                try { //user enters the number of bottles
                    System.out.print("Enter number of bottles recycled >> ");
                    bottles = recycle.nextInt();
                    if (bottles < 1) { //if input is invalid
                        Thread.sleep(500);
                        System.out.println("Invalid Input. please retry.");
                        System.out.println("");
                    }
                    else { //if valid, add to the running total
                        totalBottles = totalBottles + bottles;
                        visit ++;
                        Thread.sleep(500);
                        System.out.println("Visit " + visit + " : +" + bottles + " bottles");
                        System.out.println("Total bottles recycled is : " + totalBottles);
                        System.out.println("");
                    }
                }
                catch (InputMismatchException e) { //if invalid characters are entered
                    Thread.sleep(500);
                    System.out.println("Invalid Input. please retry.");
                    System.out.println("");
                    recycle.nextLine();
                }
            }
            
            //coupon earned
            Thread.sleep(500);
            System.out.println("CONGRATULATIONS! You earned a reward coupon!");
            System.out.println("");
            
            while (true) { //loop to ask if user wants to track another coupon
                System.out.print("Track another coupon [Y/N] >> ");
                String choice = recycle.next().strip().toLowerCase();
                if (choice.equals("yes") || choice.equals("y")) { //start over
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
        }
        //End of the Program
        System.out.println("");
        System.out.println("Thank you for recycling!");
        System.out.println("Every bottle helps the planet.");
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
    }
}
