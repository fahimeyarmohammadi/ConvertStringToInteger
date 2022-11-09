import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringToIntegerTest {
    @Test
    void convertStringToIntegerTest() {
        String value = "0";
        int number = ConvertStringToInteger.convertStringToInteger(value);
        assertEquals(0, number);
    }

    @Test
    void inputTest() {
        try {
            int number = ConvertStringToInteger.convertStringToInteger("12sd");
        } catch (NumberFormatException e) {
            assertEquals("please just enter digit", e.getMessage());
        }
    }

    @Test
    void inputBound() {
        try {
            int number = ConvertStringToInteger.convertStringToInteger("327862");
        } catch (IllegalArgumentException e) {
            assertEquals("number nut in range", e.getMessage());
        }
    }
}