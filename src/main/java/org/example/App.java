/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        String euros = in.nextLine();

        System.out.print("What is the exchange rate? ");
        String exRate = in.nextLine();

        double euro = Double.parseDouble(euros);
        double rate = Double.parseDouble(exRate);
        double exchange = euro * rate;

        System.out.println(euro + " euros at an exchange rate of " + rate + " is\n" + exchange + " U.S dollars.");

    }
}
