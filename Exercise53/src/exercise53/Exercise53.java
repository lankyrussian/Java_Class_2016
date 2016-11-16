/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise53;
import static java.lang.Math.pow;
/**
 *
 * @author KOI Computers
 */
public class Exercise53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int count;
        for (count = 1; count <= 99; count += 2)
        {
            sum = sum + count;
            System.out.println(sum);
        }
        double m = pow(2.5, 3);
        System.out.println(m);
        int i = 1;
        /*while (i <= 20)
        {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            ++i;
        
        }*/
        for (i=1; i<=20; i++)
        {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
}
