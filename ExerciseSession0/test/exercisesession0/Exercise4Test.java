package exercisesession0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise4Test extends TestConsole{

    @BeforeEach
    public void init() {
        // redirect the output stream
        redirectOut();
    }

    @AfterEach
    public void tearDown() {
        System.setIn(this.standardInput);
        System.setOut(standardOutput);
    }

    @Test
    @DisplayName("Test Exercise 4 input 10 10 10 1")
    public void testExercise4_a() {
        // ARRANGE
        provideInput("10\n 10\n 10\n 1\n");

        // ACT
        try{
            Exercise4.main(null); // call the main method with no arguments
        }catch (Exception e){
            // The input provided was not enough to exit the loop
        }

        // ASSERT
        String expected = "Please insert a number between 0 and 10: "
                + "Please insert a number between 0 and 10: "
                + "Please insert a number between 0 and 10: "
                + "Please insert a number between 0 and 10: "
                + "That's it. Thanks!\n";

        assertEquals(expected,readOutput());
    }

    @Test
    @DisplayName("Test Exercise 4 input 5 20 10 7 -4 9")
    public void testExercise4_b() {
        // ARRANGE
        provideInput("5\n 20\n 10\n 7\n -4\n 9\n");

        // ACT
        try{
            Exercise4.main(null); // call the main method with no arguments
        }catch (Exception e){
            // The input provided was not enough to exit the loop
        }

        // ASSERT
        String expected = "Please insert a number between 0 and 10: "
                + "Please insert a number between 0 and 10: "
                + "Sorry, this is an illegal number.\n"
                + "Please insert a number between 0 and 10: "
                + "Please insert a number between 0 and 10: "
                + "Please insert a number between 0 and 10: "
                + "Sorry, this is an illegal number.\n"
                + "Please insert a number between 0 and 10: "
                + "That's it. Thanks!\n";

        assertEquals(expected,readOutput());
    }


}