package com.ducph.consoledrawing.model;

import org.junit.Test;


public class PointTest {

    @Test
    public void create() {
        new Point(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() {
        new Point(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() {
        new Point(1, -7);
    }

}