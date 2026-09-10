package com.mycompany.even_or_odd_checker_v2;

//Even or Odd Checker V2

import java.util.Scanner;
//Import Scanner
public class Even_or_odd_checker_v2 {

    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
        
        //INPUT
        System.out.print("Enter number: ");
        int number_input = checker.nextInt();
        
        //PROCESSING
        int checked_number = number_input % 2; 
        String type;
        if (checked_number == 0) {
            type = "Even";
        } else {
            type = "Odd";
        }
        
        //OUTPUT
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
        System.out.println("Number: " + number_input);
        System.out.println("Type: " + type);
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
    }
}
