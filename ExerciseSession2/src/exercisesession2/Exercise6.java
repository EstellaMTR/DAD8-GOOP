
package exercisesession2;

/**
 * @author Your Name 
 * 
 * Learning goal: Evaluation of expressions and use of subroutines.
 * 
 * Exercise 1: MIA (Meyer in Danish) is a simple dice game, the Danish favorite 
 * in 2017. The game is played with 2 dice. 
 * Unlike most dice games, the value of the roll is not the sum of the dice.
 * The rolls are represented by taking the highest die's value as first digit
 * and the lowest as the last digit. So a 2 and a 1 is 21 and a 5 and 6 is 65.  
 * The highest roll is 21 (called Mia), followed by the "doubles" from 66 to 11, 
 * and then all other rolls from 65 down to 31. Thus, the complete order of rolls 
 * (from highest to lowest) is 
 *   21 (Mia), 
 *   66, 55, 44, 33, 22, 11 (Doubles), 
 *   65, 64, 63, 62, 61, 54, 53, 52, 51, 43, 42, 41, 32, 31.
 * 
 * By using the subroutine rollDie() that generates a random number from 1
 * to 6, devise a Java program that let two players roll the dice once each
 * and decides who won the game. No bluffing is allowed.
 * 
 * An example of execution should look like this:
 * 
 * Player 1's roll value is: 33
 * Player 2's roll value is: 52
 * Player 1 won.
 */
public class Exercise6 {

    public static void main(String[] args) {
        // Your solution should go here

        int playerOne = calculateRoll();
            System.out.println("Player 1's roll value is: " + playerOne);
        int playerTwo = calculateRoll();
            System.out.println("Player 2's roll value is: " + playerTwo);

        checkWinner(playerOne, playerTwo);

    }

    public static void checkWinner(int playerOne, int playerTwo){
        int playerOneScore = checkScore(playerOne);
        int playerTwoScore = checkScore(playerTwo);

        System.out.println("Player 1 score: " + playerOneScore);
        System.out.println("Player 2 score: " + playerTwoScore);

        if (playerOneScore > playerTwoScore){
            System.out.println("Player 1 wins.");
        } else if (playerTwoScore > playerOneScore){
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Tie.");
        }
    }

    public static int checkScore(int playerScore){
        int[] doubles = {66, 55, 44, 33, 22, 11};
        int[] remaining = {65, 64, 63, 62, 61, 54, 53, 52, 51, 43, 42, 41, 32, 31};

        int score = 0;

        boolean inDoubles = false;
        boolean inRemaining = false;

        for (int i = 0; i < doubles.length; i++){
            if (doubles[i] == playerScore){
                inDoubles = true;
                score = doubles[i] + 65;
            }
        }
        if (!inDoubles){
            for (int i = 0; i < remaining.length; i++){
                if (remaining[i] == playerScore){
                    inRemaining = true;
                    score = remaining[i];
                }
            }
        }

        if (playerScore == 21){
            score = 67 + 65;
        }
        System.out.println("score: " + score);
        return score;
    }

    public static int calculateRoll(){
        int numberOne = rollDie();
        int numberTwo = rollDie();
        int roll = 0;

        if (numberOne > numberTwo){
            roll = (numberOne * 10) + numberTwo;
        } else if (numberTwo > numberOne) {
            roll = (numberTwo * 10) + numberOne;
        } else {
            roll = (numberOne * 10) + numberTwo;
        }

        return roll;
    }
    
    // The subroutine rollDie() returns an integer between 1 and 6.
    public static int rollDie(){
        return (int) (Math.random()*6)+1;
    }
    
}
