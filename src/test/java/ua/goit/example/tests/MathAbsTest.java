package ua.goit.example.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathAbsTest {

    private final MathAbs mathAbs = new MathAbs();

    @Test
    void testGetAbsNumberReturnOk() {
        int expected = 10;

        int actual = mathAbs.getAbsNumber(-10);

        assertEquals(expected, actual);
    }

    @Test
    void testGetAbsNumberLessThenMinusThousandThrowException() {
        int argument = -1000;

        assertThrows(IllegalArgumentException.class, () -> mathAbs.getAbsNumber(argument));
    }
}