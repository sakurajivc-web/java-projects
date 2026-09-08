/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.text_analyzer_v1;

// A program that analyzes text input from the user.

import java.util.Scanner;

public class Text_analyzer_v1 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        
        Scanner analyzer = new Scanner(System.in);
        
        System.out.print("Enter a phrase -> ");
        String phrase_input = analyzer.nextLine().trim();
        
        int phrase_length = phrase_input.length();
        
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        
        System.out.println("Length: " + phrase_length);
        System.out.println("Uppercase: " + phrase_input.toUpperCase());
        System.out.println("Lowercase: " + phrase_input.toLowerCase());
        System.out.println("First Character: " + phrase_input.charAt(0));
        System.out.println("Last Character: " + phrase_input.charAt(phrase_length - 1));
        System.out.println("Comparison to \"i love java\": " + phrase_input.toLowerCase().equals("i love java"));
        
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
    }
}
