package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;

public class DrawRectangleCommandTest {

    @Test
    public void testCreate() throws Exception {
        new DrawRectangleCommand("1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate1() throws Exception {
        new DrawRectangleCommand("-1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate2() throws Exception {
        new DrawRectangleCommand("1", "-1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate3() throws Exception {
        new DrawRectangleCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate4() throws Exception {
        new DrawRectangleCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate6() throws Exception {
        new DrawRectangleCommand();
    }
}