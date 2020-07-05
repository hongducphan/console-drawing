package com.ducph.consoledrawing.util;

import com.ducph.consoledrawing.model.CommandType;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void toPositiveInt() {
        assertEquals(Utils.toPositiveInt("11"), 11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toPositiveInt2() {
        Utils.toPositiveInt("0");
    }

    @Test(expected = NumberFormatException.class)
    public void toPositiveInt3() {
        Utils.toPositiveInt("aa");
    }

    @Test
    public void shouldAllPositive() {
        Utils.shouldAllPositive(1, 2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldAllPositive2() {
        Utils.shouldAllPositive(1, -2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldAllPositive3() {
        Utils.shouldAllPositive(1, 2, 0, 4);
    }

    @Test
    public void shouldAllNonNegative2() {
        Utils.shouldAllPositive(1, 2, 3, 4);
    }

    @Test
    public void shouldAllNonNegative() {
        Utils.shouldAllNonNegative(1, 2, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldAllNonNegative3() {
        Utils.shouldAllPositive(1, -2, 3, 4);
    }
    
    @Test
    public void extractCommandTypeC() {
        assertEquals(Utils.extractCommandType("C 1 5"), CommandType.C);
    }

    @Test
    public void extractCommandTypeL() {
        assertEquals(Utils.extractCommandType("L 1 1 1 4"), CommandType.L);
    }

    @Test
    public void extractCommandTypeR() {
        assertEquals(Utils.extractCommandType("R 1 1 1 4"), CommandType.R);
    }

    @Test
    public void extractCommandTypeB() {
        assertEquals(Utils.extractCommandType("B 1 1 c"), CommandType.B);
    }

    @Test
    public void extractCommandTypeInvalidType1() {
        assertNotEquals(Utils.extractCommandType("C 10 5"), CommandType.L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void extractCommandTypeInvalidType2() {
        Utils.extractCommandType("T 1 1 1 4");
    }
}