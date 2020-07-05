package com.ducph.consoledrawing.model;

import org.junit.Test;


public class LineTest {

    @Test
    public void testCreate() {
        new Line(1, 2, 1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid() {
        new Line(-1, 2, 1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid2() {
        new Line(1, -2, 3, 3);
    }
}