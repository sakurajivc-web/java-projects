/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparison_report_v1;

//Number Comparison report

import java.util.Scanner;
//Scanner import
public class Comparison_report_v1 {

    public static void main(String[] args) {
        Scanner comparison = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        
        //INPUT
        System.out.print("Enter first number: ");
        int number_1 = comparison.nextInt();
        
        System.out.print("Enter second number: ");
        int number_2 = comparison.nextInt();
        
        //PROCESSING
        boolean greater_than = number_1 > number_2;
        boolean less_than = number_1 < number_2;
        boolean equal_to = number_1 == number_2;
        boolean not_equal_to = number_1 != number_2;
        
        //OUTPUT
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("    N U M B E R   C O M P A R I S O N");
        System.out.println("");
        System.out.println("First Number: " + number_1);
        System.out.println("Second Number: " + number_2);
        System.out.println("");
        System.out.println("1st number > Second Number? " + greater_than);
        System.out.println("1st number < Second Number? " + less_than);
        System.out.println("1st number == Second Number? " + equal_to);
        System.out.println("1st number != Second Number? " + not_equal_to);
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
    }
}
