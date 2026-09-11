package com.mycompany.safe_calculator_v2;

//Safe calculator (fix the divide-by-zero risk)

import java.util.Scanner;
//Scanner import

public class Safe_calculator_v2 {

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("");
        
        //INPUT
        System.out.print("Enter First Number: ");
        int number_1 = calculator.nextInt();
        
        System.out.print("Enter Second Number: ");
        int number_2 = calculator.nextInt();
        
        //PROCESSING
        int sum = number_1 + number_2;
        int diff = number_1 - number_2;
        int prod = number_1 * number_2;
        
        //OUTPUT
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("First Number: " + number_1);
        System.out.println("Second Number: " + number_2);
        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        if (number_2 == 0) {
            System.out.println("Cannot divide by Zero");
        } else { 
            System.out.println("Quotient: " + number_1 / number_2);
        }
        if (number_2 == 0) {
            System.out.println("Cannot divide by Zero");
        } else { 
            System.out.println("Remainder: " + number_1 % number_2);
        }
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("");
    }
}
