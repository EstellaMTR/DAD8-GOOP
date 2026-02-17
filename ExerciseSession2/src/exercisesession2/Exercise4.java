
package exercisesession2;

/**
 * @author Your Name 
 * 
 * Learning goal: Understanding arrays and subroutines.
 * 
 * Exercise 4: Complete the following Java program that prints to
 * standard output the content of an array. Your task it to complete
 * the code that is missing in the subroutine arrayPrint().
 * 
 * A correct execution of this program should look like this:
 * 
 * The content of the array is:
 * 1 2 3 4 5 6
 * 
 */
public class Exercise4 {

    public static void main(String[] args) {
        // DO NOT CHANGE THIS METHOD!
        int[] nums = {1,2,3,4,5,6};
        System.out.println("The content of the array is:");
        arrayPrint(nums);
    
    }
    
    // The subroutine arrayPrint takes an array of interger as
    // input and prints to standard output its content.
    public static void arrayPrint(int[] array) {
        System.out.println("The content of the array is: ");
        for (int i = 0; i < array.length; i++){
           System.out.print(array[i] + " ");
        }

        // Alternatively:
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
    }
    
}
