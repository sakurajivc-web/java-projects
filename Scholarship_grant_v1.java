package com.mycompany.scholarship_grant_v1;

/**
 * Andrew Jared N. Veracruz â€” BIT12
 * Lab Exam â€” Midterms
 */

import java.util.Scanner;
import java.util.InputMismatchException;
//imports

public class Scholarship_grant_v1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in); //scaanner for input
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("");
        //header
        
        String studentName = null;
        float entExam_score, generalAvg = 0;
        int monthlyFam_income, semesterTuition = 0;
        //input variables
       
        //INPUT
        while (true) { //loop for getting student name
            Thread.sleep(400);
            System.out.print("Enter Student Name: ");
            studentName = console.nextLine().strip();
            if (studentName.equals("")) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
            }
            else { break; }
        }
        while (true) { //loop for getting entrance exam score
            try {
                Thread.sleep(400);
                System.out.print("Enter Entrance Exam Score [0-100]: ");
                entExam_score = console.nextInt();
                if (entExam_score < 0 || entExam_score > 100) {
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
                }
                else { break; }
            }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                console.nextLine();
            }
        }
        while (true) { //loop for getting general avg
            try {
                Thread.sleep(400);
                System.out.print("Enter General Average [0-100]: ");
                generalAvg = console.nextInt();
                if (generalAvg < 60 || generalAvg > 100) {
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
                }
                else { break; }
            }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                console.nextLine();
            }
    }
        while (true) { //loop for getting montly income
            try {
                Thread.sleep(400);
                System.out.print("Enter Monthly Family Income: ");
                monthlyFam_income = console.nextInt();
                if (monthlyFam_income < 0) {
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
                }
                else { break; }
            }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                console.nextLine();
            }
    }
        while (true) { //loop for getting tuition fee
            try {
                Thread.sleep(400);
                System.out.print("Enter Tuition Fee: ");
                semesterTuition = console.nextInt();
                if (semesterTuition < 0) {
                    Thread.sleep(500);
                    System.out.println("Invalid Input. Please retry.");
                    System.out.println("");
                }
                else { break; }
            }
            catch (InputMismatchException e) {
                Thread.sleep(500);
                System.out.println("Invalid Input. Please retry.");
                System.out.println("");
                console.nextLine();
            }
    }
    //PROCESSING
    float weightedAdm_score = (float) ((0.6 * entExam_score) + (0.4 * generalAvg));
    int scholarshipGrant = 0;
    String scholarshipStatus;
    //variables for output and processing
    
    //get scholarship grant based on inputs
    if (weightedAdm_score >= 90 && monthlyFam_income <= 20000) {
        scholarshipGrant = 30000;
        scholarshipStatus = "Full Scholarship";
    }
    else if (weightedAdm_score >= 90 && monthlyFam_income > 20000) {
        scholarshipGrant = 15000;
        scholarshipStatus = "Partial Scholarship";
    }
    else if (weightedAdm_score >= 80 && monthlyFam_income <= 15000) {
        scholarshipGrant = 15000;
        scholarshipStatus = "Partial Scholarship";
    }
    else if (weightedAdm_score >= 80 && monthlyFam_income > 15000) {
        scholarshipGrant = 0;
        scholarshipStatus = "Not Qualified";
    }
    else {
        scholarshipGrant = 0;
        scholarshipStatus = "Not Qualified";
    }
    //compute tuition fee balance
    int tuitionFee_balance;
    if (semesterTuition < 0) {
        tuitionFee_balance = scholarshipGrant;
    }
    else { 
        tuitionFee_balance = semesterTuition - scholarshipGrant;
        if (tuitionFee_balance < 0) {
            tuitionFee_balance = 0;
        }
    }

    //Display the Results (OUTPUT)
    Thread.sleep(500);
    System.out.println("");
    System.out.println("=========================================================");
    System.out.println("");    
    Thread.sleep(500);
    System.out.println("Applicant Name: " + studentName);
    System.out.printf("Weighted Admission Score: " + weightedAdm_score + "\n");
    System.out.println("Monthly Family Income: PhP" + monthlyFam_income);
    System.out.println("");
    Thread.sleep(500);
    System.out.println("Scholarship Status: " + scholarshipStatus);
    System.out.println("Scholarship Grant: PhP" + scholarshipGrant);
    System.out.println("Tuition Balance: PhP" + tuitionFee_balance);
    System.out.println("");
    System.out.println("=========================================================");
    System.out.println("");    
    }
}