/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise511;
import java.util.Scanner;
/**
 *
 * @author KOI Computers
 */
public class Exercise511 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Enter an integer: ");
        int a = scanner.nextInt();
        System.out.println ("Enter another integer: ");
        int b = scanner.nextInt();
        if (a<b)
        {
            System.out.println("Your first integer is less than your second");            
        } 
        if (a>b)
        {
            System.out.println("Your second integer is less than your first");
        }
    }
    
}
