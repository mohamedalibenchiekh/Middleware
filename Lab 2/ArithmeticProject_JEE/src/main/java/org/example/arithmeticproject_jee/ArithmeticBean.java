package org.example.arithmeticproject_jee;

public class ArithmeticBean {
    private int value1;
    private int value2;

    // Getters and Setters
    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    // Arithmetic methods
    public int add() {
        return value1 + value2;
    }

    public int subtract() {
        return value1 - value2;
    }

    public int multiply() {
        return value1 * value2;
    }

    public int divide() {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
