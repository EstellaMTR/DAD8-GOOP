package exercisesession2;

import java.util.Scanner;

/**
 * @author Your Name
 * 
 * Learning goal: Combining control-flow structures and understanding of  
 * primitive types.
 * 
 * Exercise 4: Write a program that asks the user for five numbers and compute
 * their exact average. An example of execution should look like this:
 * 
 * Please insert a number: 5
 * Please insert a number: 7
 * Please insert a number: 7
 * Please insert a number: 7
 * Please insert a number: 7
 * 
 * Average: 6.6
 * 
 * Hint: Remember that types matter!
 */
public class Exercise3 {
    
    public static void main(String[] args) {

        float[] numbers = new float[5];

        float total = 0;
        float length = numbers.length;

        for (int i = 0; i < length; i++){
            numbers[i] = getNumber();
            System.out.println("number: " + numbers[i]);
            total += numbers[i];
        }

        float average = total/length;

        System.out.println("Average: " + average);

    }

    private static int getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        return input.nextInt();
    }

}
