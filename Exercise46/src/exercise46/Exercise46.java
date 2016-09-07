/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise46;

/**
 *
 * @author KOI Computers
 */
public class Exercise46 {

    public static void main(String[] args)
    {
        int sum = 0;
        int x = 1;
        while (x <= 10) 
        {
            sum = x+sum; 
            x++; 
        }

        System.out.printf("The sum is: %d%n", sum);
    }
    
}
