
package exercisesession0;

import java.util.Scanner;

/**
 * @author Your Name 
 * 
 * Learning goal: Guessing the meaning of a new Java program
 * 
 * Exercise 1: Mark is a very talented programmer but also a bit lazy... 
 * This time he "forgot" to write the documentation of the program below.
 * Your goal is to understand what his program does and explain what each 
 * statement/instruction by writing a comment above it.
 * 
 * It might be that some of the statements are totally new to you.
 * Never mind! Try to guess what their meaning is by executing the program
 * and use a bit of imagination. 
 */
public class Exercise1 {
    // The main function of the class Exercise1. It is public so other classes can refer to it too.
    public static void main(String[] args) {
        // Declaring a variable called input which is of class type "Scanner".
        // Initialized as a new Scanner object. Give input access to all Scanner methods.
        Scanner input = new Scanner(System.in);
        // Print to the terminal to ask the user for their name
        System.out.print("Please, enter your name: ");
        // Store the user's input in a variable called name
        // "The nextLine() method returns a string containing all of the
        // characters up to the next new line character in the scanner, or up to the end of the scanner if
        // there are no more new line characters."
        String name = input.nextLine();
        // Another print statement
        System.out.print("Please, enter your age: ");
        // Storing the users entered input as their age
        int age = input.nextInt();
        // if the age is more than or equal to 18, then print that they can votes
        if (age >= 18) {
            System.out.println("Welcome " + name + ", " + "you can vote!");
        } else {
            // else print that they cant
            System.out.println("Sorry " + name + ", " + "you cannot vote yet");
        }
        //testing
    }
    
}
