package com.mycompany.networking_tool_v1;

//Short Java Project

import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Networking_tool_v1 {

    public static void main(String[] args) throws InterruptedException, UnknownHostException{
        Scanner networking = new Scanner(System.in); //scanner
        String domainName = null; //declare string
        
         //getting the IP address
        
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        //header
        
        //INPUT
        while (true) {
            Thread.sleep(500);
            System.out.print("Enter Domain Name: ");
            domainName = networking.next().strip(); //get domain
            if (domainName.isEmpty() || domainName.contains(" ") || !domainName.contains(".")) { //if input is invalid
                Thread.sleep(500);
                System.out.println("Invalid Input. please retry.");
                System.out.println("");
            }
            else { break; } //if valid
        }
        
        InetAddress[] addresses = InetAddress.getAllByName(domainName); //DNS lookup
        
        //OUTPUT
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        Thread.sleep(500);
        System.out.println("Domain: " + domainName);
        System.out.println("");
        Thread.sleep(500);
        for (InetAddress address : addresses) {
            System.out.println("IP Address: " + address.getHostAddress());
        }
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
    }
}
