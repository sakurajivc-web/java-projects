package com.mycompany.grade_classifier_v1;

//Grade classifier

import java.util.Scanner;
//Scanneer import

public class Grade_classifier_v1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");
        
        //INPUT
        //Student Info
        System.out.print("Enter Name: ");
        String student_name = console.nextLine().trim();
        System.out.print("Enter CYS: ");
        String cys = console.next().trim().toUpperCase();
        
        System.out.println("");
        
        //Student Grades
        System.out.print("Enter Grade in Java: ");
        int java_grade = console.nextInt();
        System.out.print("Enter Grade in Python: ");
        int py_grade = console.nextInt();
        System.out.print("Enter Grade in Computing: ");
        int comp_grade = console.nextInt();
        System.out.print("Enter Grade in Stats: ");
        int stats_grade = console.nextInt();
        
        //PROCESSING
        double general_average = (java_grade + py_grade + comp_grade + stats_grade) / 4;
        //Gen Avg of Student
        
        String gen_avg_remark, java_grade_remark, 
                py_grade_remark, comp_grade_remark, stats_grade_remark;
        //Remarks for Each Grades
        
        if (java_grade >= 75) {
            java_grade_remark = "Passed";
        }
        else {
            java_grade_remark = "Failed";
        }
        
        if (py_grade >= 75) {
            py_grade_remark = "Passed";
        }
        else {
            py_grade_remark = "Failed";
        }
        
        if (comp_grade >= 75) {
            comp_grade_remark = "Passed";
        }
        else {
            comp_grade_remark = "Failed";
        }
        
        if (stats_grade >= 75) {
            stats_grade_remark = "Passed";
        }
        else {
            stats_grade_remark = "Failed";
        }
                
        if (general_average >= 98) {
            gen_avg_remark = "With Highest Honors";
        }
        else if (general_average >= 95) {
            gen_avg_remark = "With High Honors";
        }
        else if (general_average >= 90) {
            gen_avg_remark = "With Honors";
        }
        else if (general_average >= 75) {
            gen_avg_remark = "Passed";
        }
        else {
            gen_avg_remark = "Failed";
        }
        //OUTPUT
        
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("     S T U D E N T   R E P O R T");
        System.out.println("=====================================");
        System.out.println("");
        System.out.println("Student: " + student_name);
        System.out.println("CYS: " + cys);
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");
        System.out.println("Java: " + java_grade + " : " +  java_grade_remark);
        System.out.println("Python: " + py_grade + " : " +  py_grade_remark);
        System.out.println("Computing: " + comp_grade + " : " +  comp_grade_remark);
        System.out.println("Stats: " + stats_grade + " : " +  stats_grade_remark);
        System.out.println("General Average:" + general_average + "\n" + gen_avg_remark);
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");
    }
}
