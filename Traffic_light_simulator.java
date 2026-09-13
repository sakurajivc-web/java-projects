package com.mycompany.traffic_light_simulator;

//Simple Traffic Light Simulator

import java.util.Scanner;
public class Traffic_light_simulator {

    public static void main(String[] args) throws InterruptedException{
        Scanner traffic = new Scanner(System.in);
        //Scanner
        
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        //Header
        
        //INPUT
        System.out.print("Enter Traffic Light Color: ");
        String tl_color = traffic.next().strip().toUpperCase();
        
        System.out.println("");
        
        //PROCESSING + OUTPUT
        switch (tl_color) {
            case "RED":
                Thread.sleep(0450);
                System.out.println("Action: STOP!");
                break;
            case "YELLOW":
                Thread.sleep(1000);
                System.out.println("Action: Slow down..");
                break;
            case "GREEN":
                Thread.sleep(0700);
                System.out.println("Action: Go!");
                break;
            default:
                Thread.sleep(1000);
                System.out.println("Invalid Color Input.");
                break;
        }
        
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
    }
}
