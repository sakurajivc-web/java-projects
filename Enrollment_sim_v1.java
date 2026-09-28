package com.mycompany.enrollment_sim_v1;

//AJV - Final Practice

import java.util.Scanner;
import java.util.InputMismatchException;
//imports


public class Enrollment_sim_v1 {

    public static void main(String[] args) throws InterruptedException{
        Scanner enrollment = new Scanner(System.in); //scanner
        
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        //header;
                
        //INPUT
        String studentName = null;
        String yearType = null;
        String program = null;
        int studentAge = 0;
        int yearLevel = 0;
        int selectedProg = 0;
        int subjectAmount = 0;
        double basePrice = 0;
        double scholarDiscount = 0;
        double finalPrice = 0;
                
        //get user's name and age
        while (true) { //loop for getting student name
            Thread.sleep(500);
            System.out.print("Enter Student Name: ");
            studentName = enrollment.nextLine().strip();
            if (studentName.equals("")) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
            }
            else { break; }
        }
        while (true) { //loop for getting student age
            try {
                Thread.sleep(500);
                System.out.print("Enter Student Age: ");
                studentAge = enrollment.nextInt();
                if (studentAge < 1 || studentAge > 125) {
                    Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
            }
                else {
                    if (studentAge < 18) {
                        Thread.sleep(500);
                        System.out.println("Must be 18+ to enroll.");
                        System.out.println("");
                    }
                    else { break; } 
                }
        }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                enrollment.nextLine();
            } 
        }       
        YearLoop:
        while (true) { //loop for getting studenr year
            try {
                Thread.sleep(400);
                System.out.print("Enter Student Year [1-4]: ");
                yearLevel = enrollment.nextInt();
                
                switch (yearLevel) {
                    case 1:
                        yearType = "First Year";
                        break YearLoop;
                    case 2:
                        yearType = "Second Year";
                        break YearLoop;
                    case 3:
                        yearType = "Third Year";
                        break YearLoop;
                    case 4:
                        yearType = "Fourth Year";
                        break YearLoop;
                    default:
                        Thread.sleep(500);
                        System.out.println("Invalid Input. Please retry.");
                        System.out.println("");
                        continue;
                } 
        }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                enrollment.nextLine();
            } 
        }
        OuterLoop:
        while (true) { //loop for getting selected program
            try {
                Thread.sleep(400);
                System.out.println("Choose a Program: ");
                System.out.println("[1] - BSIT");
                System.out.println("[2] - BSCS");
                System.out.println("[3] - BSCPE");
                System.out.print("-> ");
                selectedProg = enrollment.nextInt();
                
                switch (selectedProg) {
                    case 1:
                        program = "BSIT";
                        break OuterLoop;
                    case 2:
                        program = "BSCS";
                        break OuterLoop;
                    case 3:
                        program = "BSCPE";
                        break OuterLoop;
                    default:
                        Thread.sleep(500);
                        System.out.println("Invalid Input. Please retry.");
                        System.out.println("");
                } 
        }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                enrollment.nextLine();
            }
        }
    
        while (true) { //loop for suibject amounts 
            try {
                Thread.sleep(500);
                System.out.print("Enter Subject Amounts [1-12]: ");
                subjectAmount = enrollment.nextInt();
                if (subjectAmount < 1 || subjectAmount > 12) {
                    Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
            }
                else {
                    if (subjectAmount >= 10) {
                        basePrice = 15000;
                        break;
                    }
                    else if (subjectAmount >= 7) {
                        basePrice = 12000;
                        break;
                    }
                    else if (subjectAmount >= 5) {
                        basePrice = 9000;
                        break;
                    }
                    else {
                        basePrice = 5000;
                        break; 
                    } 
                }
        }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                enrollment.nextLine();
            } 
        }
        while (true) { //loop for checking if student is scholar or not
            Thread.sleep(500);
            System.out.print("Scholar or Not? [Yes or No]: ");
            String checkScholar = enrollment.next().strip().toUpperCase();
            if (checkScholar.equals("YES") || checkScholar.equals("Y")) {
                scholarDiscount = 0.85;
                break;
            }
            else if (checkScholar.equals("NO") || checkScholar.equals("N")) {
                scholarDiscount = 1;
                break;
            }
            else {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
            } 
        }
        //computation for tuition
        finalPrice = basePrice * scholarDiscount;
        
        //OUTPUT
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("Student Name: " + studentName);
        System.out.println("Year: " + yearType);
        System.out.println("Program: " + program);
        System.out.println("Subjects: " + subjectAmount);
        System.out.println("Tuition Fee: PhP" + finalPrice);
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");       
    }
}
