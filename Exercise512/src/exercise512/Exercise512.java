/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise512;

/**
 *
 * @author KOI Computers
 */
public class Exercise512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int product = 1;
        for(int i=1;i<16;i++){
            if (i % 2 != 0) {
                product = product*i;
                System.out.println (i);
            }
        }
        System.out.println("All numbers multiplied = "+product);
    }
    
}
