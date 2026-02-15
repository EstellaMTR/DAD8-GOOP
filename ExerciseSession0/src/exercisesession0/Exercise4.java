
package exercisesession0;

import java.util.Scanner;

/**
 * @author Your Name
 * 
 * Learning goal: Understanding the combination of control flow structures.
 * 
 * Exercise 4: Write a program that asks the user to insert a series of numbers 
 * between 0 and 10, one by one, and stops only when the sum is greater than 30.
 * If the number given is less than 0 or bigger than 10 it should discard this
 * number, print an error message, and ask for the number again.
 * An example of execution should look like this:
 * 
 * Please insert a number between 0 and 10: 5
 * Please insert a number between 0 and 10: 20
 * Sorry, this is an illegal number.
 * Please insert a number between 0 and 10: 10
 * Please insert a number between 0 and 10: 7
 * Please insert a number between 0 and 10: -4
 * Sorry, this is an illegal number.
 * Please insert a number between 0 and 10: 7
 * Please insert a number between 0 and 10: 9
 * That's it. Thanks!
 */
public class Exercise4 {
    
    public static void main(String[] args) {

        int total = 0;

        while (total < 30) {
            int number = getValidNumber();
            total = calcTotal(total, number);
            System.out.println("total: " + total);
        }
    }

    private static int getValidNumber(){
        int number = getNumber();
        boolean isValid = checkIfValidNumber(number);

        while (!isValid){
            number = getNumber();
            isValid = checkIfValidNumber(number);
        }
        return number;
    }

    private static int getNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please insert a number between 0 and 10");

        return input.nextInt();
    }

    private static boolean checkIfValidNumber(int number){
        if (number > 10 || number <0){
            System.out.print("Sorry, this is an illegal number");
            return false;
        }
        return true;
    }


    private static int calcTotal(int total, int number) {
        total += number;
        return total;
    }

}
