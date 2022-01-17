package ua.goit.example.tests;

public class MathAbs {

    public int getAbsNumber(int number) {
        if (number <= -1000) {
            throw new IllegalArgumentException("Number less then a - 1000");
        }

        return Math.abs(number);
    }
}
