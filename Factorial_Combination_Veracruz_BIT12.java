package com.mycompany.factorial_combination_veracruz_bit12.java;

/**
 *  Andrew Jared N. Veracruz - BIT12
 *  Methods EA: Factorial and Combination 
 */

import javax.swing.*;

//imports

public class Factorial_Combination_Veracruz_BIT12 {
    
    static void invalidInput() throws InterruptedException { //display if input is invalid //utilities
        Thread.sleep(500);
        JOptionPane.showMessageDialog(null, "Invalid input. Please retry.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    static int askNumber(String message, int min, int max) throws InterruptedException { //asks for a whole number until it's valid //utilities
        while (true) { //loop for getting a valid number from user
            String text = JOptionPane.showInputDialog(null, message, "Input", JOptionPane.QUESTION_MESSAGE);
            if (text == null) { //if user clicked cancel or X, end the program
                System.exit(0);
            }
            try {
                int number = Integer.parseInt(text.strip());
                if (number < min || number > max) { //if number is out of range
                    invalidInput();
                } else { //return the value if it's valid
                    return number;
                }
            } catch (NumberFormatException e) { //if input from user is an invalid character
                invalidInput();
            }
        }
    }
    
    //INPUT
    static int getSelectedOption() throws InterruptedException { //get option from user input
        return askNumber("Factorial and Combination Calculator\n\n"
                + "[1] Factorial\n"
                + "[2] Combination\n\n"
                + "Select option:", 1, 2);
    }
    
    static int getN() throws InterruptedException { //get n from user input
        return askNumber("Enter n (0-20):", 0, 20);
    }
    
    static int getM(int n) throws InterruptedException { //get m from user input, m can't be greater than n
        return askNumber("Enter m (0-" + n + "):", 0, n);
    }
    
    //PROCESSING
    static long factorial(int n) { //returns the factorial of n
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    
    static long combination(int n, int m) { //returns the combination of n taken m
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
    
    //OUTPUT
    static void displayFactorial(int n, long result) throws InterruptedException { //display factorial result
        Thread.sleep(500);
        JOptionPane.showMessageDialog(null, n + "! = " + result, "Factorial", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void displayCombination(int n, int m, long result) throws InterruptedException { //display combination result with the factorials used
        Thread.sleep(500);
        JOptionPane.showMessageDialog(null,
                "Combination of " + n + " taken " + m + "\n\n" +
                n + "! = " + factorial(n) + "\n" +
                m + "! = " + factorial(m) + "\n" +
                (n - m) + "! = " + factorial(n - m) + "\n\n" +
                "C(" + n + ", " + m + ") = " + result,
                "Combination", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static boolean returnMenu() throws InterruptedException { //get answer if user wants to try again or no
        while (true) { //loop for getting user's input
            Thread.sleep(500);
            String choice = JOptionPane.showInputDialog(null, "Would you like to try again? [Y/N]", "Try Again", JOptionPane.QUESTION_MESSAGE);
            if (choice == null) { //if user clicked cancel or X, treat it as no
                return false;
            }
            choice = choice.strip().toLowerCase();
            if (choice.equals("y") || choice.equals("yes")) {
                return true;
            } else if (choice.equals("n") || choice.equals("no")) {
                return false;
            }
            else { invalidInput(); }
        }
    }
    
    //Method MANAGER
    static void manager() throws InterruptedException { //all methods called out here
        int selectedOption = getSelectedOption();
        int n = getN();
        
        if (selectedOption == 1) { //factorial
            long result = factorial(n);
            displayFactorial(n, result);
        } else { //combination
            int m = getM(n);
            long result = combination(n, m);
            displayCombination(n, m, result);
        }
    }
    
    //MAIN PROGRAM
    public static void main(String[] args) throws InterruptedException {
        while (true) { //if user wants to repeat, restart program, otherwise exit
            manager();
            if (returnMenu() != true) {
                break;
            }
        }
        Thread.sleep(500);
        JOptionPane.showMessageDialog(null, "Thank you for using our tool!", "Goodbye", JOptionPane.PLAIN_MESSAGE);
    }
}