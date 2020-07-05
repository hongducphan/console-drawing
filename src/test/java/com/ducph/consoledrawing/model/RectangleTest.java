package com.ducph.consoledrawing.model;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void create() {
        new Rectangle(1, 2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() {
        new Rectangle(-1, 2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() {
        new Rectangle(-1, 2, -3, 4);
    }
}