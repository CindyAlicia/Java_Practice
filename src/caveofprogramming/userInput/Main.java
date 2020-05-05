package caveofprogramming.userInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Output the promt
        System.out.println("Enter your name: ");

        //Wait for the user to enter a line of text
        String line = input.nextLine();

        //Tell them what they entered
        System.out.println("You entered: " + line);

        Scanner inputNew = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int value = inputNew.nextInt();

        System.out.println("You entered: " + value);

        System.out.println("Hello " + line + " your are " + value + " years old.");
    }
}
