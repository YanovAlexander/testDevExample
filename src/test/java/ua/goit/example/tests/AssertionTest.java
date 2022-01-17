package ua.goit.example.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
class AssertionTest {

    @Test
    void testAssertEqualsShouldReturnTrue() {
        //given
        //when
        String expected = "text";
        String actual = "text";

        assertEquals(expected, actual);
    }

    @Test
    void testAssertArrayEqualsShouldReturnTrue() {
        byte[] expected = "text".getBytes();
        byte[] actual = "text".getBytes();

        assertArrayEquals(expected, actual);
    }
}
