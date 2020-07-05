package com.ducph.consoledrawing.util;

import com.ducph.consoledrawing.model.CommandType;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void testToPositiveInt() {
        assertEquals(Utils.toPositiveInt("11"), 11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToPositiveInt2() {
        Utils.toPositiveInt("0");
    }

    @Test(expected = NumberFormatException.class)
    public void testToPositiveInt3() {
        Utils.toPositiveInt("aa");
    }

    @Test
    public void testShouldAllPositive() {
        Utils.shouldAllPositive(1, 2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShouldAllPositive2() {
        Utils.shouldAllPositive(1, -2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShouldAllPositive3() {
        Utils.shouldAllPositive(1, 2, 0, 4);
    }

    @Test
    public void testShouldAllNonNegative2() {
        Utils.shouldAllPositive(1, 2, 3, 4);
    }

    @Test
    public void testShouldAllNonNegative() {
        Utils.shouldAllNonNegative(1, 2, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShouldAllNonNegative3() {
        Utils.shouldAllPositive(1, -2, 3, 4);
    }
    
    @Test
    public void testExtractCommandTypeC() {
        assertEquals(Utils.extractCommandType("C 1 5"), CommandType.C);
    }

    @Test
    public void testExtractCommandTypeL() {
        assertEquals(Utils.extractCommandType("L 1 1 1 4"), CommandType.L);
    }

    @Test
    public void testExtractCommandTypeR() {
        assertEquals(Utils.extractCommandType("R 1 1 1 4"), CommandType.R);
    }

    @Test
    public void testExtractCommandTypeB() {
        assertEquals(Utils.extractCommandType("B 1 1 c"), CommandType.B);
    }

    @Test
    public void testExtractCommandTypeInvalidType1() {
        assertNotEquals(Utils.extractCommandType("C 10 5"), CommandType.L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractCommandTypeInvalidType2() {
        Utils.extractCommandType("T 1 1 1 4");
    }
}