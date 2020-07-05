package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;

public class DrawRectangleCommandTest {

    @Test
    public void testCreate() {
        new DrawRectangleCommand("1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid() {
        new DrawRectangleCommand("-1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid2() {
        new DrawRectangleCommand("1", "-1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid3() {
        new DrawRectangleCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid4() {
        new DrawRectangleCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid5() {
        new DrawRectangleCommand();
    }
}