package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;

public class BucketFillCommandTest {

    @Test
    public void testCreate() {
        new BucketFillCommand( "1", "1", "o");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate1() {
        new BucketFillCommand( "-1", "1", "o");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate2() {
        new BucketFillCommand( "1", "-1", "o");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate3() {
        new BucketFillCommand( "1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate4() {
        new BucketFillCommand( "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate6() {
        new BucketFillCommand();
    }

}