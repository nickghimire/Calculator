/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import com.leapfrog.calculator.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Welcome to calculator");

        while (true) {
            System.out.println("Enter First number ");

            c.setX(input.nextInt());
            System.out.println("Enter second number");

            c.setY(input.nextInt());

            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.Div");
            System.out.println("5.Power");
            System.out.println("6.Max");
            System.out.println("7.Min");
            System.out.println("8.MultiplicationFormat");
            System.out.println("9.Exit");
            System.out.println("Enter our choice[1-9]:");

            int choice = input.nextInt();
            double total = 0;

            if (choice == 1) {
                System.out.println(c.add());
            } else if (choice == 2) {

                System.out.println(c.sub());

            } else if (choice == 3) {
                System.out.println(c.mul());

            } else if (choice == 4) {
                System.out.println(c.div());
            } else if (choice == 5) {
                System.out.println(c.power());
            } else if (choice == 6) {
                System.out.println(c.max());
            } else if (choice == 7) {
                System.out.println(c.min());
            } else if (choice == 8) {
               c.multificationTable();
            } else if (choice == 9) {
                System.exit(0);

            }
     
            System.out.println("Do you want to continue[Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("ch")) {
                System.exit(0);

            }//while close 

        }
    
    }
}