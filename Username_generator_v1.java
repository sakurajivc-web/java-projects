package com.mycompany.username_generator_v1;

// A simple username generator based from the first and last name of the user

import java.util.Scanner;
public class Username_generator_v1 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("====================================");
        System.out.println("");
        
        Scanner name_generator = new Scanner(System.in);
        //Scanner for Input
        
        System.out.print("Enter First name: ");
        String first_name = name_generator.next();
        
        System.out.print("Enter Last name: ");
        String last_name = name_generator.next();
        
        System.out.println("");
        System.out.println("====================================");
        System.out.println("");
        
        System.out.println("Generated username: " + first_name.toLowerCase().substring(0, 3) + last_name.toLowerCase().substring(0, 3));
        System.out.println("");
        System.out.println("====================================");
    }
}
