//Imports
package com.projeto;

import static org.junit.Assert.*;
import org.junit.Test;
import com.project.Calc;

//Program
public class TestExtress {

    @Test
    public void TestSum() {
        Calc Calc = new Calc();
        int result = Calc.sum(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void TestSubtraction() {
        Calc Calc = new Calc();
        int result = Calc.subtraction(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void TestMultiplication() {
        Calc Calc = new Calc();
        int result = Calc.multiplication(6, 2);
        assertEquals(12, result);
    }

    @Test
    public void TestDivision() {
        Calc Calc = new Calc();
        double result = Calc.division(10, 2);
        assertEquals(5.0, result, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void TestDivByZero() {
        Calc Calc = new Calc();
        Calc.division(5, 0);
    }
}