package com.company;
import java.util.Scanner;
class customexception extends Exception{
    customexception(String s) {
        System.out.println(s);
    }
}
public class Main
{
    static void value(int sum , int n) throws customexception {
        if(n==0)
            throw new customexception("Please enter the valid number");
        else
            System.out.println("The average is "+sum/n);
    }
    public static void main(String [] args) throws customexception
    {
        int n;
        int sum;
        Scanner in =new Scanner(System.in);
        sum=in.nextInt();
        n=in.nextInt();
        try {
            value(sum, n);
        }
        catch(Exception e)
        {
            System.out.println("Try Again...");
        }
    }
}