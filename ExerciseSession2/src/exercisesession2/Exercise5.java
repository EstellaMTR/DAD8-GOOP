
package exercisesession2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Your Name 
 * 
 * Learning goal: Declaration and random access of arrays.
 * 
 * Exercise 4: Design a Java program that asks the user for a number n
 * greater than 2 and constructs an array of size n whose content 
 * follows the following rule:
 * - The value at indices 0 and 1 is equal to 1;
 * - The value at index i > 1 is the sum of the values hold by the same array 
 *   at the two indices preceeding it (ie. the indices i-1 and i-2).
 * 
 * For example, if the number given by the user is 7, the array produced
 * should be {1, 1, 2, 3, 5, 8, 13}.
 * 
 * Hint: to check the content of your array, why not using the subroutine
 * printArray defined in Exercise 4?
 * 
 */
public class Exercise5 {

    public static void main(String[] args) {
        int number = getValidNumber();

        buildArray(number);
    }

    private static int getValidNumber(){
        int number = getNumber();
        boolean isValid = checkIsValidNumber(number);

        if (!isValid){
            number = getNumber();
            isValid = checkIsValidNumber(number);
        }

        return number;
    }

    private static int getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number greater than 2: ");

        return input.nextInt();
    }

    private static boolean checkIsValidNumber(int number){
        return number > 2;
    }

    private static void buildArray(int number){
//        For example, if the number given by the user is 7, the array produced
//        should be {1, 1, 2, 3, 5, 8, 13}.
        int[] array = new int[number];


        for (int i = 0; i < array.length; i++){
            if(i <= 1){
                array[i] = 1;
            } else {
                array[i] = (array[i - 1]) + (array[i-2]);
                System.out.println("array[i]: " + array[i]);
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
