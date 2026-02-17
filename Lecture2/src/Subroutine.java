public class Subroutine {
    static void main(String[] args){
        // Reference variables allow us to use dot notation to access a number of methods.
        // When we make an object, we can make our own methods
        String name = "Giorgio";

        int len = name.length();

        boolean isEqual = name.equals("Giovanni");

        char midLetter = name.charAt(len/2);

        double randomNumber = Math.random();
        double asin = Math.asin(4.5);

        int[] nums = new int[5];
        int size = nums.length;
        nums[0] = 20;
        nums[3] = nums[0] + 3;

        int dim = 3;
        int [][]  squareBoard = new int[dim][dim];

        for (int i=0; i<dim;i++){
            for (int j=0; j<dim; j++){
                squareBoard[i][j] = i+j;
            }
        }

        for (int i=0; i<dim;i++){
            for (int j=0; j<dim; j++){
                System.out.print(squareBoard[i][j] + ", ");
            }
            System.out.println();
        }
    }
}