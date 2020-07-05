package com.ducph.consoledrawing.model;

import org.junit.Test;


public class LineTest {

    @Test
    public void create() {
        new Line(1, 2, 1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() {
        new Line(-1, 2, 1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() {
        new Line(1, -2, 3, 3);
    }
}