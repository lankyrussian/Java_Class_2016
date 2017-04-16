/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise53;

/**
 *
 * @author jaws4
 */
public class Exercise53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count;
        int sum;
        sum = 0;
        for (count = 1; count <= 99; count += 2)
            sum += count;
        System.out.println(sum);
        
        double result = Math.pow(2.5, 3);
        System.out.println(result);
        
        int i;
        i = 1;
        while (i <= 20)
        {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            ++i;
        }
        
        for (i = 1; i <= 20; i++)
        {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
    
}
