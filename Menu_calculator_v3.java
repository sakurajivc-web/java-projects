package com.mycompany.menu_calculator_v3;

//Simple Menu Calculator

import java.util.Scanner;
//Scanner import
public class Menu_calculator_v3 {

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        //Header
        
        //INPUT
        System.out.println("[Addition - 1]");
        System.out.println("[Subtraction - 2]");
        System.out.println("[Multiplication - 3]");
        System.out.println("[Division - 4]");
        
        System.out.print("Select Operation: ");
        int selected_op = calculator.nextInt();
        
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        
        //PROCESS
        String operation_name = null;
        int number_1 = 0, number_2 = 0;
        
        switch (selected_op) {
            case 1:
                System.out.print("Enter First Number: ");
                number_1 = calculator.nextInt();
                System.out.print("Enter Second Number: ");
                number_2 = calculator.nextInt();
                operation_name = "Addition";
                break;
            case 2:
                System.out.print("Enter First Number: ");
                number_1 = calculator.nextInt();
                System.out.print("Enter Second Number: ");
                number_2 = calculator.nextInt();
                operation_name = "Subtraction";
                break;
            case 3:
                System.out.print("Enter First Number: ");
                number_1 = calculator.nextInt();
                System.out.print("Enter Second Number: ");
                number_2 = calculator.nextInt();
                operation_name = "Multiplication";
                break;
            case 4:
                System.out.print("Enter First Number: ");
                number_1 = calculator.nextInt();
                System.out.print("Enter Second Number: ");
                number_2 = calculator.nextInt();
                operation_name = "Division";
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
        //OUTPUT
        if (operation_name != null) {
            switch (operation_name) {
                case "Addition":
                    System.out.println("Operation: " + operation_name);
                    System.out.println("Result: " + (number_1 + number_2));
                    break;
                case "Subtraction":
                    System.out.println("Operation: " + operation_name);
                    System.out.println("Result: " + (number_1 - number_2));
                    break;
                case "Multiplication":
                    System.out.println("Operation: " + operation_name);
                    System.out.println("Result: " + (number_1 * number_2));
                    break;
                case "Division":
                    System.out.println("Operation: " + operation_name);
                    System.out.println("Result: " + (number_1 / number_2));
                    break;
            }
        }
        if (operation_name != null) {
            System.out.println("");
            System.out.println("=============================================");
            System.out.println("");
        }
    }
}
