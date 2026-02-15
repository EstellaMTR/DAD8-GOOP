package exercisesession0;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test extends TestConsole{

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
    @DisplayName("Test Exercise 2 with input 5")
    public void testExercise2withInput5() {
        // ARRANGE
        provideInput("5"); // provide 5 as input

        // ACT
        Exercise2.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Please insert a number greater than zero: "
                +"*\n"
                + "**\n"
                + "***\n"
                + "****\n"
                + "*****\n";

        assertEquals(expected,readOutput());
    }

    @Test
    @DisplayName("Test Exercise 2 with input 0")
    public void testExercise2withInput0() {
        // ARRANGE
        provideInput("0"); // provide 0 as input

        // ACT
        Exercise2.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Please insert a number greater than zero: ";

        assertEquals(expected,readOutput());
    }


}