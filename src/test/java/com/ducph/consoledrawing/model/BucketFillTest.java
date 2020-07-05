package com.ducph.consoledrawing.model;

import org.junit.Test;

public class BucketFillTest {

    @Test
    public void testCreate() {
        new BucketFill(1, 2, 'o');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid() {
        new BucketFill(-1, 2, 'o');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalid2() {
        new BucketFill(1, -2, 'o');
    }
}