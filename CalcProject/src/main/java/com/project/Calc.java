package com.project;

public class Calc {

    // Calculations Functions
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Divisão por ZERO não é valida, tente novamente!");
        }
    }

    // Program
    public static void main(String[] args) {
        Calc Calc = new Calc();

        int ValueA = 10;
        int ValueB = 5;

        System.out.println("Sua SOMA deu: " + Calc.sum(ValueA, ValueB));
        System.out.println("Sua SUBTRAÇÃO deu: " + Calc.subtraction(ValueA, ValueB));
        System.out.println("Sua MULTIPLICAÇÂO deu: " + Calc.multiplication(ValueA, ValueB));

        try {
            System.out.println("Sua DIVISÃO deu: " + Calc.division(ValueA, ValueA));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}