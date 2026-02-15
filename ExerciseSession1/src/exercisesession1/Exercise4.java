package exercisesession1;

import java.util.Scanner;

/**
 * @author Your Name
 * 
 * Learning goal: Understanding of control-flow structures.
 * 
 * Exercise 4: Write a program that asks the user for five numbers and compute
 * their sum. An example of execution should look like this:
 * 
 * Please insert a number: 5
 * Please insert a number: 7
 * Please insert a number: 7
 * Please insert a number: 7
 * Please insert a number: 7
 * 
 * Sum: 33
 * 
 */
public class Exercise4 {
    
    public static void main(String[] args) {
        int total = 0;

       for(int counter = 0; counter <5; counter ++){
           int number = getNumber();
           total += number;
       }
       System.out.println("Total: " + total);
    }


    private static int getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        return input.nextInt();
    }


}
