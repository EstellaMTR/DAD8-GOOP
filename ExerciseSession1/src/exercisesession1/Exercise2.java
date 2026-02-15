
package exercisesession1;

import java.util.Scanner;

/**
 * @author Your Name 
 * 
 * Learning goal: Understanding the combination of control flow structures.
 * 
 * * Exercise 2: Write a program that asks the user to insert a number n greater 
 * than zero and prints to standard output the "number triangle" for this number.
 * An example of execution should look like this:
 * 
 * Please insert a number greater than zero: 5
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 */
public class Exercise2 {

    public static void main(String[] args) {
        int number = getValidNumber();

        printNumberTriangle(number);
    }

    private static int getValidNumber(){
        int number = getNumber();
        boolean isValid = checkIsValidNumber(number);

        while (!isValid){
            number = getNumber();
            isValid = checkIsValidNumber(number);
        }
        return number;
    }

    private static int getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert a number greater than 0");

        return input.nextInt();
    }

    private static boolean checkIsValidNumber(int number){
        return number >= 0;
    }

    private static void printNumberTriangle(int number){
        for(int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }
}
