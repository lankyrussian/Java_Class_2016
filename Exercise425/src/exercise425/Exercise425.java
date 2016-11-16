/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise425;

/**
 *
 * @author KOI Computers
 */
public class Exercise425
{
    public static void main(String[] args)
    {
        int count = 1;

        while (count <= 10)
        {
            System.out.println(count % 2 == 1 ? "Test 1" : "Test 2");
             ++count;
        }
    }
}