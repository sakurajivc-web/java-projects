/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.even_or_odd_checker_v1;

//Even or Odd checker (without if/else)

import java.util.Scanner;
//Scanner import
public class Even_or_odd_checker_v1 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        
        Scanner checker = new Scanner(System.in);
        //Scanner
        
        //INPUT
        System.out.print("Enter a number: ");
        int number = checker.nextInt();
        
        //PROCESSING
        int checked = number % 2;
        int even = 0;
        int odd = 1;
        
        //OUTPUT
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("\tE V E N   O R   O D D");
        System.out.println("");
        System.out.println("Number = " + number);
        System.out.println("Is it even? " + (checked == even));
        System.out.println("Is it odd? " + (checked == odd));
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
    }
}
