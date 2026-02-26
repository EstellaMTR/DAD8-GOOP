package exercisesession3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest extends TestConsole{
    @BeforeEach
    public void init() {
        // redirect the output stream
        redirectOut();
    }

    @AfterEach
    public void tearDown() {
        //System.setIn(this.standardInput);
        System.setOut(standardOutput);
    }

    @Test
    @DisplayName("Test Supermarket")
    public void testSupermarket() {
        // ARRANGE

        // ACT
        Supermarket.main(null); // call the main method with no arguments

        // ASSERT
        String expected = "Coca-Cola costs: 15.0\nPepsi-Cola costs: 16.0\n";
        assertEquals(expected,readOutput());
    }


}