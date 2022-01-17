package ua.goit.example.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @ParameterizedTest(name = "#{index} - Run test with args={0} exp={1}")
    @MethodSource("dataProvider")
    void testFibonacciShouldReturnEight(int input, int expected) {
        int result = fibonacci.compute(input);

        assertEquals(expected, result);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, 1), arguments(2, 1), arguments(3, 2), arguments(5, 5), arguments(8, 21), arguments(6, 8)
        );
    }
}