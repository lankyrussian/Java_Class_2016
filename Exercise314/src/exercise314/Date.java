/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise314;

/**
 *
 * @author KOI Computers
 */
public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date (int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setMonth(int month)
    {
        month = month;
    }
    public int getMonth ()
    {
        return month;
    }
    public void setDay(int day)
    {
        day = day;
    }
    public int getDay ()
    {
        return day;
    }
    public void setYear(int year)
    {
        year = year;
    }
    public int getYear ()
    {
        return year;
    }
    public void displayDate()
    {
        System.out.printf("%d",getMonth());
        System.out.printf("/%d", getDay());
        System.out.printf("/%d\n", getYear());
    }
}
