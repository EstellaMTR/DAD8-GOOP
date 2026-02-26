package exercisesession3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("Test positive setPageNumber")
    void setPageNumberPositiveValue() {
        // ARRANGE
        Book b = new Book();

        // ACT
        b.setPageNumber(70);

        // ASSERT
        assertEquals(70, b.getPageNumber());
    }

    @Test
    @DisplayName("Test negative setPageNumber")
    void setPageNumberNegativeValue() {
        // ARRANGE
        Book b = new Book();

        // ACT
        b.setPageNumber(-70);

        // ASSERT
        assertEquals(0, b.getPageNumber());
    }

    @Test
    void getPrice() {
        // ARRANGE
        Book b = new Book();

        // ACT
        b.setPageNumber(70);
        double expected = 0.3 * 70;

        // ASSERT
        assertEquals(expected, b.getPrice());
    }
}