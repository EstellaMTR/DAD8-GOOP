
package exercisesession1;

import java.util.Scanner;

/**
 * @author Your name
 * 
 * Learning goal: Understanding the combination of control flow structures.
 * 
 * Exercise 1: Write a program that asks the user to insert a number n greater 
 * than zero and prints to standard output a "checkerboard" of "w" (for white)
 * and "b" (for black) of size n x n. 
 * An example of execution should look like this:
 * 
 * Please insert a number greater than zero: 5
 * w b w b w
 * b w b w b
 * w b w b w
 * b w b w b
 * w b w b w
 * 
 * 
 * Hint: Note that, if we start counting the rows and columns from 1, 
 * a square is colored "w" exactly when the sum of its row and column is even,
 * otherwise is colored "b". 
 * So, think about how you could use the method isEven (defined below) to
 * solve the problem.
 * 
 */
public class Exercise1 {

    public static void main(String[] args) {               

        int number = getValidNumber();

        printBoard(number);
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

        System.out.println("Please insert a number greater than 0: ");

        return input.nextInt();
    }

    private static boolean checkIsValidNumber(int number){
        if(number < 0){
            System.out.println("Number must be greater than 0. ");
            return false;
        }
        return true;
    }

    private static void printBoard(int size){
        int counter = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j<size; j++){
                if(isEven(counter)){
                    System.out.print("w ");
                } else {
                    System.out.print("b ");
                }
                counter ++;
            }
            System.out.println();
        }
    }
    // This method returns the value true when called on even numbers.
    // For example, isEven(2) == true, and isEven(3) == false.
    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }
    
}
