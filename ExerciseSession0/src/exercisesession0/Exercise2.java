
package exercisesession0;

import java.util.Scanner;

/**
 * @author Estella
 * 
 * Learning goal: Apply new knowledge and understanding for-loops.
 * 
 * Exercise 2: Write a program that asks the user to insert a number n greater 
 * than zero and prints to standard output a "stair" of asterisks "*"
 * with exactly n steps. An example of execution should look like this:
 * 
 * Please insert a number greater than zero: 5
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 0");

        int number = input.nextInt();
        String star = "*";
        if (number <= 0) {
            System.out.println("Enter a number greater than 0");
        } else {
            starGrid(number, star);
        }
    }

    private static void starGrid(int times, String star){
        for(int i=0; i<times; i++){
            for(int j=0; j<=i; j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
