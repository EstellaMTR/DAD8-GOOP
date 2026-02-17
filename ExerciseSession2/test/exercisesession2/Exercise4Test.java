package exercisesession2;

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
        // System.setIn(this.standardInput);
        System.setOut(standardOutput);
    }

    @Test
    @DisplayName("Test Exercise 4")
    public void testExercise4() {
        // ARRANGE

        // ACT
        Exercise4.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "The content of the array is:\n"
                + "1 2 3 4 5 6 \n";

        assertEquals(expected,readOutput());
    }
}