package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;

public class BucketFillCommandTest {

    @Test
    public void testCreate() {
        new BucketFillCommand( "1", "1", "o");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid() {
        new BucketFillCommand( "-1", "1", "o");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid1() {
        new BucketFillCommand( "1", "-1", "o");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid2() {
        new BucketFillCommand( "1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid3() {
        new BucketFillCommand( "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid4() {
        new BucketFillCommand();
    }

}