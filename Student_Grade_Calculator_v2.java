package com.mycompany.student_grade_calculator_v2;

//A program that calculates a student's average and determines their academic standing.

import java.util.Scanner;
import java.util.InputMismatchException;
//imports

public class Student_Grade_Calculator_v2 {
    static Scanner console = new Scanner(System.in);
    
    static void header() { //header utility
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
    }
    static void invalidInput() throws InterruptedException { //utility for invalid input
        Thread.sleep(500);
        System.out.println("");
        System.out.println("Invalid Input! Please retry.");
        System.out.println("");
    }
    
    //INPUTs
    static String studentName_input() throws InterruptedException { //get name of student method
        while (true) {
            System.out.print("Enter Full Name >> ");  
            String studentName_input = console.nextLine().strip(); //get input
            if (studentName_input.isEmpty()) { //invalid input 
                invalidInput();
            } else { return studentName_input; } //accept if okay
        }
    }
    
    static int subjectAmount_input() throws InterruptedException { //get input of amount of subjects to get grade from the user
        while (true) {
            try { 
                Thread.sleep(500);
                System.out.print("Enter amounts of subject >> ");
                int subjectAmount_input = console.nextInt(); //get input
                if (subjectAmount_input < 2 ||  subjectAmount_input > 15) { //invalid input 
                   invalidInput(); 
                } else { //accept if okay
                    console.nextLine(); //clear the leftover enter
                    return subjectAmount_input;
                }
            } catch (InputMismatchException e) { //invalid input 
                invalidInput();
                console.nextLine();
            }
        }
    }
    
    static double gradesSub_input(int subjectAmount) throws InterruptedException { //get the grades of each subject and return the computed average
        double totalGrades = 0; //declare total grade

        for (int i = 0; i < subjectAmount; i++) {
            while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println("");
                    System.out.print("Enter Grade >> "); //get input
                    double grade = console.nextDouble();
                    if (grade < 0 || grade > 100) { //invalid input 
                        invalidInput();
                    } else { //add to total if okay
                        totalGrades += grade;
                        console.nextLine(); //clear the leftover enter
                        break;
                    }
                } catch (InputMismatchException e) { //invalid input 
                    invalidInput();
                    console.nextLine();
                }
            }
        }
        return totalGrades / subjectAmount; //return as computed average
    }

    //PROCESSING
    static String processGrade(double genAvg) { //determine academic standing based on the average
        if (genAvg >= 98) {
           return "With Highest Honors";
        } 
        else if (genAvg >= 95) {
            return "With High Honors";
        }
        else if (genAvg >= 90) {
            return "With Honors";
        }
        else if (genAvg >= 75) {
            return "Passed";
        }
        else {
            return "Failed";
        }
    }
    
    //OUTPUT 
    static void displayResult(String studentName, int subjectAmount, double genAvg, String standing) throws InterruptedException { //display results
       Thread.sleep(500);
       header();
       System.out.println("Student: " + studentName); Thread.sleep(500);
       System.out.println("Total Subjects: " + subjectAmount); Thread.sleep(500);
       System.out.printf("General Average: %.2f%%\n", genAvg); Thread.sleep(500);
       System.out.println("Academic Standing: " + standing); Thread.sleep(500);
       header();
    }
    
    static boolean returnMenu() throws InterruptedException { //get answer if user wants to try again or no
        while (true) { //loop for getting user's input
            Thread.sleep(500);
            System.out.println("Would you like to try again? [Y/N]");
            System.out.print(">> ");
            String choice = console.nextLine().strip().toLowerCase();
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
        header();
        String studentName = studentName_input();
        int subjectAmount = subjectAmount_input();
        double genAvg = gradesSub_input(subjectAmount);
        String standing = processGrade(genAvg);
        
        displayResult(studentName, subjectAmount, genAvg, standing);
    }
    
    //MAIN PROGRAM
    public static void main(String[] args) throws InterruptedException {
        while (true) { //if user wants to repeat, restart program, otherwise exit
            manager();
            if (returnMenu() != true) {
                break;
            }
        }
        header();
        Thread.sleep(500);
        System.out.println("Thank you for using our tool!");
        header();
    }
}