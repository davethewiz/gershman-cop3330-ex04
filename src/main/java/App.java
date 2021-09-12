/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static void main( String[] args )
    {
        String noun = GetInput("Enter a noun: ");
        String verb = GetInput("Enter a verb: ");
        String adj = GetInput("Enter an adjective: ");
        String adverb = GetInput("Enter an adverb: ");
        
        String output = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adverb);
        System.out.print(output);
    }
}