package com.mycompany.number_guessing_v1;

//Guess the Number

import java.util.Scanner;
import java.util.Random;
//Imports

public class Number_guessing_v1 {

    public static void main(String[] args) throws InterruptedException{
        Scanner console = new Scanner(System.in); //scanner 
        Random rand = new Random(); //randomizer for secret number
        
        int secret_number = rand.nextInt(100) + 1;
        
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");
        //header
        
        //INPUT + PROCESS + OUTPUT
        while (true) {
            System.out.print("Enter guess: "); //get user's guess
            int guess = console.nextInt();
            
            if (guess < secret_number) { //if user's guess is lower than the secret number
                Thread.sleep(500);
                System.out.println("Higher!");
                System.out.println("");
            }
            else if (guess > secret_number) { //if user's guess is higher than the secret number
                Thread.sleep(500);
                System.out.println("Lower!");
                System.out.println("");
            }
            else { //if user's guess is the secret number
                Thread.sleep(500);
                System.out.println("");
                System.out.println("You guessed it! \nThe number was " + secret_number);
                break;
            }
        }
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");
    }
}
