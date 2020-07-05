package com.ducph.consoledrawing.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTypeTest {

    @Test
    public void testQ() {
        assertEquals("Q", CommandType.Q.name());
    }

    @Test
    public void testC() {
        assertEquals("C", CommandType.C.name());
    }

    @Test
    public void testL() {
        assertEquals("L", CommandType.L.name());
    }

    @Test
    public void testR() {
        assertEquals("R", CommandType.R.name());
    }

    @Test
    public void testB() {
        assertEquals("B", CommandType.B.name());
    }
}
