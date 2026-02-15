package exercisesession1;

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
    @DisplayName("Test Exercise 3 with input 0")
    public void testExercise3withInput0() {
        testConversion(0, "-3");
    }

    @Test
    @DisplayName("Test Exercise 3 with input 20")
    public void testExercise3withInput20() {
        testConversion(20, "00");
    }

    @Test
    @DisplayName("Test Exercise 3 with input 40")
    public void testExercise3withInput40() {
        testConversion(40, "02");
    }

    @Test
    @DisplayName("Test Exercise 3 with input 60")
    public void testExercise3withInput60() {
        testConversion(60, "4");
    }

    @Test
    @DisplayName("Test Exercise 3 with input 80")
    public void testExercise3withInput80() {
        testConversion(80, "7");
    }

    @Test
    @DisplayName("Test Exercise 3 with input 90")
    public void testExercise3withInput90() {
        testConversion(90, "10");
    }

    @Test
    @DisplayName("Test Exercise 3 with input 100")
    public void testExercise3withInput100() {
        testConversion(100, "12");
    }



    private void testConversion(int input, String expectedGrade){
        // ARRANGE
        provideInput("" + input); // provide the input

        // ACT
        Exercise3.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Please, insert the total score: "
                + "The corresponding grade is " + expectedGrade;

        assertEquals(expected,readOutput());
    }
}