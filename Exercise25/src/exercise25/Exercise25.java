/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise25;

import java.util.Scanner;

/**
 *
 * @author KOI Computers
 */
public class Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int z;
        int product;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first int: ");
        x = scanner.nextInt();
        System.out.println("Enter second int: ");
        y = scanner.nextInt();
        System.out.println("Enter third int; ");
        z = scanner.nextInt();
        product = x*y*z;
        System.out.printf("Product is %d%n",product);
    }
    
}
