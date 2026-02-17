package exercisesession2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise5Test extends TestConsole{
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
    @DisplayName("Test Exercise 5")
    public void testExercise5() {
        // ARRANGE
        provideInput("7");

        // ACT
        Exercise5.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Please, enter a number greater than 2: "
                + "1 1 2 3 5 8 13 \n";

        assertEquals(expected,readOutput());
    }
}