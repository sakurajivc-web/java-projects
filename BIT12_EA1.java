package com.mycompany.bit12_ea1;

//Andrew Jared N. Veracruz
//BIT12
//Enabling Assessment : Java Fundamentals

import java.util.Scanner;
public class BIT12_EA1 {

    public static void main(String[] args) {
        //scanner
        Scanner meralco = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        
        //Input
        System.out.print("Enter Customer Name: ");
        String customer_name = meralco.nextLine();
        
        System.out.print("Enter Electricity Consumption in kWh: ");
        int elec_cnsmpt = meralco.nextInt();
        
        //Process
        //Computations
        
        double elec_charge = elec_cnsmpt * 11.85;
        //compute the electricity charge
        
        double energy_tax = elec_charge * 0.05;
        //compute the energy tax
        
        double meter_mntnc_fee = 75.00;
        //assign fixed rate for meter maintenance fee
        
        double total_amount_due = elec_charge + energy_tax + meter_mntnc_fee;
        
        //Output
        
        //Display Meralco Bill
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("\tM E R A L C O\tB I L L");
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        System.out.println("Greetings, " + customer_name + "!");
        System.out.println("Your Total Amount due for this month is:\n \t  PhP" + total_amount_due);
        System.out.println("===========================================");
        System.out.println("\t   F   E   E   S");
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        System.out.println("Electricity Consumption: PhP" + elec_cnsmpt + " kWh");
        System.out.println("Rate: + PhP 11.85");
        System.out.println("");
        System.out.println("Electricity Charge: PhP" + elec_charge);
        System.out.println("Energy Tax: PhP" + energy_tax);
        System.out.println("Meter Maintenance Fee: PhP" + meter_mntnc_fee);
        System.out.println("Total Amount due: PhP" + total_amount_due);
        System.out.println("");
        System.out.println("===========================================");
        
    }
}