package com.ducph.consoledrawing.model;

import org.junit.Test;


public class PointTest {

    @Test
    public void testCreate() {
        new Point(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid() {
        new Point(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid2() {
        new Point(1, -7);
    }

}