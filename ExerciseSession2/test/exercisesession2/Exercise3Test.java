package exercisesession2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise3Test extends TestConsole{
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
    @DisplayName("Test Exercise 3 with input 5 7 7 7 7")
    public void testExercise3() {
        // ARRANGE
        provideInput("5\n 7\n 7\n 7\n 7\n"); // provide 5 as input

        // ACT
        Exercise3.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Please insert a number: "
                + "Please insert a number: "
                + "Please insert a number: "
                + "Please insert a number: "
                + "Please insert a number: \n"
                + "Average: 6.6\n";

        assertEquals(expected,readOutput());
    }
}