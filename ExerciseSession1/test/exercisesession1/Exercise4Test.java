package exercisesession1;

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
    @DisplayName("Test Exercise 4 with input 5 7 7 7 7")
    public void testExercise4() {
        // ARRANGE
        provideInput("5\n 7\n 7\n 7\n 7\n"); // provide 5 as input

        // ACT
        Exercise4.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Please insert a number: "
                + "Please insert a number: "
                + "Please insert a number: "
                + "Please insert a number: "
                + "Please insert a number: \n"
                + "Sum: 33\n";

        assertEquals(expected,readOutput());
    }
}