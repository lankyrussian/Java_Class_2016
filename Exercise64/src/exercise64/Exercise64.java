/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise64;
import static java.lang.Math.sqrt;
/**
 *
 * @author KOI Computers
 */
public class Exercise64 {

    /**
     * @param args the command line arguments
     */
    
    public static double hypotenuse(double side1, double side2){
        double csquared = (side1 * side1) + (side2 * side2);
        double c = Math.sqrt(csquared);
        return c;
    };
    
    public static int smallest(int x, int y, int z){
        if (x<y&&x<z)
            return x;
        else if (y<x&&y<z)
            return y;
        else if (z<x&&z<y)
            return z;
        else return 2147483647;
    };
    public void instructions(){
        
    };
    public static float intToFloat(int number){
        return number;
    };
    public static void main(String[] args) {
        float number = intToFloat(8);
        System.out.println("int to float is "+number);
        int smallnum = smallest(-7,-7,8);
        System.out.println("Smallest number is "+smallnum);
        double hypotenuse = hypotenuse(4,3);
        System.out.println("The hypotenuse is "+hypotenuse);
    }
}
