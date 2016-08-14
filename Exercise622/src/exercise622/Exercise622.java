/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise622;

import java.util.Scanner;

/**
 *
 * @author KOI Computers
 */
public class Exercise622 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int choice = 0;
        double temperature;
        while (choice != 3){
            System.out.println("1. Fahrenheit to Celsius\t2. Celsius to Fahrenheit\t3. Exit");
            System.out.print("Choice : ");
            choice = in.nextInt();
            switch (choice){
                case 3: break;
                case 1: 
                    System.out.print("Enter Temperature: ");
                    temperature = in.nextDouble();
                    System.out.println(temperature+" Fahrenheit equals "+ftoc(temperature)+" Celsius");
                    break;
                case 2: 
                    System.out.print("Enter Temperature: ");
                    temperature = in.nextDouble();
                    System.out.println(temperature+" Celsius equals "+ctof(temperature)+" Fahrenheit");
                    break;
            }
        }
    }
    private static double ftoc(double fahrenheit){
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    
    private static double ctof(double celsius) {
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }
}
