
package exercisesession0;

import java.util.Scanner;

/**
 * @author Estella
 * 
 * Learning goal: Using the correct control flow structures.
 * 
 * Exercise 3: Write a program that asks the user to insert a number n greater 
 * than zero and prints to standard output a "triangle" of asterisks "*"
 * of height n. An example of execution should look like this:
 * 
 * Please insert a number greater than zero: 5
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 
 * Hint: The triangle is drawn by combining white spaces and asterisks.
 * How many white spaces has the first line? How many the second? Try to 
 * come up with a pattern that can help you drawing the correct solution.
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 0");

        int number = input.nextInt();
        String star = "*";
        if (number <= 0) {
            System.out.println("Number must be greater than 0");
        } else {
            starGrid(number, star);
        }
    }

    private static void starGrid(int times, String star){
        for(int i=0; i<times; i++){
            for(int k=times; k>i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print(star);
                System.out.print(star);
            }
            System.out.print(star);
            System.out.println();
        }
    }
    
}
