package com.example.shop;

import com.example.shop.model.Calc;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class CalcTest {
    private Calc calc = new Calc();
    @Test
    public void plusTest() {
        assertEquals(Optional.of(5).get(), calc.plus(3, 2));
        assertEquals(Optional.of(-5).get(), calc.plus(-1, -4));
    }
    @Test
    public void minusTest() {
        assertEquals(Optional.of(5).get(), calc.minus(8, 3));
        assertEquals(Optional.of(-5).get(), calc.minus(-8, -3));
    }
}

