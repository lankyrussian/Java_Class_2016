/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise630;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author KOI Computers
 */
public class Exercise630 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        int number = 1+randomNumbers.nextInt(1000);
        int userguess = -1;
        int userinput = 0;
        while ((userinput != -1) || (userguess != 0)){
            System.out.print("Guess a number between 1 and 1000. Enter -1 to quit.");
            userinput = in.nextInt();
            if (userinput == -1){
                break;
            }
            userguess = storen (number, userinput);
            if (userguess == 0) {
                break;
            }
        }
    
    }
    public static int storen(int random, int userinput){
        int ret = -1;
        if (random>userinput){
            System.out.println("This number is too low! Try again");
        }
        if (userinput>random){
            System.out.println("This number is too high! Try again");
        }
        if (userinput==random){
            System.out.println("This number is correct!");
            ret = 0;
        }
        return ret;
    
    }
}
