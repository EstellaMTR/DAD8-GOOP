
package exercisesession1;

import java.util.Scanner;

/**
 * @author Your Name
 * 
 * Learning goal: Understanding control-flow structures.
 * 
 * Exercise 3: Write a program that takes a number, say n, from 0 to 100 and 
 * converts it to a grade according to the following conversion table:
 * 
 * -3 whenever n is less than or equal to 0
 * 00 when n is in the interval between 1 and 20
 * 02 when n is in the interval between 21 and 40
 * 4  when n is in the interval between 41 and 60
 * 7  when n is in the interval between 61 and 80
 * 10 when n is in the interval between 81 and 90
 * 12 when n is greater than of equal to 91
 * 
 * An example of execution should look like this:
 * 
 * Please, insert the total score: 74
 * The corresponding grade is 7
 * 
 */
public class Exercise3 {

    public static void main(String[] args) {
        int number = getValidNumber();

        gradeConversion(number);
    }

    private static int getValidNumber(){
        int number = getNumber();
        boolean isValid = checkIsValidNumber(number);

        while(!isValid){
            number = getNumber();
            isValid = checkIsValidNumber(number);
        }

        return number;
    }

    private static int getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number grade between 0 and 100");

        return input.nextInt();
    }

    private static boolean checkIsValidNumber(int number){
        return number >= 0 && number <= 100;
    }

    private static void gradeConversion(int number){
        if(number <=0){
            System.out.println("Grade: -3");
        } else if (number <= 20) {
            System.out.println("Grade: 00");
        } else if (number <= 40) {
            System.out.println("Grade: 02");
        } else if (number <= 60) {
            System.out.println("Grade: 4");
        } else if (number <= 80) {
            System.out.println("Grade: 7");
        } else if (number <= 90) {
            System.out.println("Grade: 10");
        } else if (number <= 100) {
            System.out.println("Grade: 12");
        }
    }
}
