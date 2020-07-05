package com.ducph.consoledrawing.model;

import org.junit.Test;

public class BucketFillTest {

    @Test
    public void create() {
        new BucketFill(1, 2, 'o');
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() {
        new BucketFill(-1, 2, 'o');
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() {
        new BucketFill(1, -2, 'o');
    }
}