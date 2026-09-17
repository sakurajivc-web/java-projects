package com.mycompany.login_attempt_simulator_v1;

//Simple Login Attempt Simulator

import java.util.Scanner; //scanner import
public class Login_attempt_simulator_v1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner login = new Scanner(System.in); //scanner
        String correct_password = "java123";
        int attempts = 0;
        
        
        System.out.println("");
        System.out.println("===================================");
        System.out.println("");
        //header
        
        outerLoop:
        while (true) {
            Thread.sleep(500);
            System.out.print("Enter password: "); // get password from user
            String password_attempt = login.next().strip();
            
           if (password_attempt.equals(correct_password)) { // if password is correct
               attempts = attempts + 1;
               System.out.println("");
               Thread.sleep(500);
               System.out.println("Access Granted! Attempts: " + attempts); // if correct
               break;
           }
           else { // if password is incorrect
               attempts = attempts + 1; // add attempt per wrong attempts
               System.out.println("");
               Thread.sleep(500);
               System.out.println("Wrong Password. Attempts: " + attempts);
               System.out.println("");
               if (attempts == 5) { //if max attekmpts reached, display
               System.out.println("Max Attempts Reached.");
               break outerLoop;
                        }
               while (true) {
                   System.out.print("[1] Try again or [2] Give up: "); //try again or give up attempt
                   int choice = login.nextInt();
                   System.out.println("");
                   if (choice < 1 || choice > 2) { //if choice not valid
                       System.out.println("Invalid Input.");
                   }
                   else {
                        switch (choice) { //if still incorrect
                            case 1:
                                continue outerLoop;
                            case 2:
                                break outerLoop; //if incorrect
                        }        
                   }

               }
               
           }         
            
        }
        
        System.out.println("");
        System.out.println("===================================");
        System.out.println("");
        
    }
}
