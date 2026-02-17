package exercisesession2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise1Test extends TestConsole{
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
    @DisplayName("Test Exercise 1 with input 5 and 7")
    public void testExercise1() {
        // ARRANGE
        provideInput("5\n 7\n"); // provide the input

        // ACT
        Exercise1.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Insert the value of a: "
                + "Insert the value of b: "
                + "Now, the variable a contains the value 7\n"
                + "and the variable b contains the value 5\n";

        assertEquals(expected,readOutput());
    }

}