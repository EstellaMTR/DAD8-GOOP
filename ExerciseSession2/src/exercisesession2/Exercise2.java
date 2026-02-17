
package exercisesession2;

import java.util.Scanner;

/**
 * @author Your Name 
 * 
 * Learning goal: Understanding primitive types.
 * 
 * Exercise 2: We already know Mark, the lazy programmer from the first exercise session. 
 * Mark this time has just learned that variables of type byte use much less memory 
 * than those of type int. Since he has been told that a good programmer always 
 * try to use the least memory as possible, he thought that he could replace all
 * the counters of type int in his for-loops with variables of type byte. 
 * This time however, the result is not the one he was expecting.
 * 
 * For the solution of this exercise try to execute the following program
 * first by declaring the counter variable i of type int; then repeat 
 * the execution declaring the variable i of type byte, as Mark did. 
 * Describe as a comment what happens and why the two executions differ so much.
 * 
 */
public class Exercise2 {

    public static void main(String[] args) {
        
        for (byte i=0; i <= 127; i++) {
            System.out.println("I'm inside the loop. i: " + i);
        }
        System.out.println("I'm finally outside the loop.");
        
        // Insert here your thoughts
        // If we convert i to type byte, it will always be less than or equal to 127, so the loop continues forever
    }
    
}
