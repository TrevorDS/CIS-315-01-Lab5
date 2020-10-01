/*
Author: Trevor Sherrill
Date: 9/30/2020
Class: CIS-315-01 w/ Professor Herath
References:
- https://stackoverflow.com/questions/27988174/returning-string-methods-in-java
- https://www.geeksforgeeks.org/compare-two-strings-in-java/
*/
import java.util.Scanner;
import java.util.Random;

public class RollDiceTimes {

    // Short-hand for Print Method
    public static void print(String msg) {
        System.out.print(msg);
    }

    // Short-hand for Print Line Method
    public static void println(String msg) {
        System.out.println(msg);
    }

    // Get first letter of string (lowercased)
    public static String getFirstLetter(String str) {

        // Get the first letter from the str argument
        String firstLetter = str.substring(0, 1);

        // Set the first letter to lowercase
        String lowercaseLetter = firstLetter.toLowerCase();

        // Return the lowercased, first letter
        return lowercaseLetter;
    }

    // Main Method
    public static void main(String[] args) {

        // Variable(s)
        String rollAgain = "y";
        int die1;
        int die2;

        // Initialize Input Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize Random Object
        Random random = new Random();

        // While Loop
        while (rollAgain.equals("y")) {

            println("\n" + "Rolling the dice...");

            // Roll die 1 & 2
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            // Print output
            println("You rolled " + die1 + " and " + die2 + "!");

            // Ask if they want to roll again
            print("Would you like to roll again? ([y]es or [n]o)?: ");

            // Get the input & assign it to the sentinel value
            rollAgain = getFirstLetter(input.nextLine());

        }

    }

}