package com.ducph.consoledrawing.model;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void testCreate() {
        new Rectangle(1, 2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid() {
        new Rectangle(-1, 2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid2() {
        new Rectangle(-1, 2, -3, 4);
    }
}