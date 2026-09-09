package com.mycompany.movie_title_formatter;

//A short projectb that makes the user's movie input formatted.

import java.util.Scanner;
//Import
public class Movie_title_formatter {

    public static void main(String[] args) {
        Scanner movie = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");
        
        //INPUT
        
        System.out.print("Enter movie title: ");
        String movie_input = movie.nextLine();
        
        System.out.print("Enter release year: ");
        int year_input = movie.nextInt();
        
        //PROCESS
        String title_case = movie_input.substring(0,1).toUpperCase() + movie_input.substring(1);
        int letter_count = movie_input.replace(" ", "").length();
        
        
        //OUTPUT
        System.out.println("");
        System.out.println("========================================");
        System.out.println("\t M O V I E   C A R D");
        System.out.println("Title Case: " + title_case);
        System.out.println("All Caps: " + movie_input.toUpperCase());
        System.out.println("Letters: " + letter_count);
        System.out.println("Tagline: " + "\"" + movie_input.trim().toUpperCase() + "\"" + " (" + year_input + ") " + " - " + letter_count + " letters");
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");
    }
}
