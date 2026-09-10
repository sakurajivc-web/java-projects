package com.mycompany.basic_calculator_v1;

//Basic calculator, all operators

import java.util.Scanner;
//Scanner import
public class Basic_calculator_v1 {

    public static void main(String[] args) {
        Scanner operations = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");
        
        //INPUT
        System.out.print("Enter first number: ");
        int number_1 = operations.nextInt();
        System.out.print("Enter second number: ");
        int number_2 = operations.nextInt();
        
        //PROCESSING
        //Different calculations for basic operations
        int sum = number_1 + number_2;
        int diff = number_1 - number_2;
        int prod = number_1 * number_2;
        int quot = number_1 / number_2;
        int rmndr = number_1 % number_2;
        
        //OUTPUT
        System.out.println("");
        System.out.println("========================================");
        System.out.println("\t O P E R A T I O N S");
        System.out.println("");
        System.out.println("First number: " + number_1);
        System.out.println("Second number: " + number_2);
        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Remainder: " + rmndr);
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");
    }
}
