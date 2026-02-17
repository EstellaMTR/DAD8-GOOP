
package exercisesession2;

import java.util.Scanner;

/**
 * @author Your Name
 * 
 * Learning goal: Understanding variable assignments.
 * 
 * Exercise 1: Complete the following Java program that switches the
 * values of the variables a and b. A correct solution of the 
 * exercise should have an execution that looks like this:
 * 
 * Insert the value of a: 5
 * Insert the value of b: 7
 * Now, the variable a contains the value 7
 * and the variable b contains the value 5
 *
 * Hint: Remember that variables are like "cups" (assignments make them 
 * act like containers). How would you switch the content of two cups 
 * without spilling/loosing their content? 
 * 
 */
public class Exercise1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insert the value of a: ");                
        int a = input.nextInt();
        System.out.print("Insert the value of b: ");                
        int b = input.nextInt();
                
        // Your code should ONLY go here

        int c = a;
        a = b;
        b = c;
        System.out.println("Now, the variable a contains the value " + a);
        System.out.println("and the variable b contains the value " + b);        
    }
    
}
