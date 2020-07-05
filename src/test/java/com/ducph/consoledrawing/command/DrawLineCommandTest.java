package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;


public class DrawLineCommandTest {

    @Test
    public void testCreate() {
        new DrawLineCommand("1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid() {
        new DrawLineCommand("-1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid2() {
        new DrawLineCommand("1", "-1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid3() {
        new DrawLineCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid4() {
        new DrawLineCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreatInvalid5() {
        new DrawLineCommand();
    }
}