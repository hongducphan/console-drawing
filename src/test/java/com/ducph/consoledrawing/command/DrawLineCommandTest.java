package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;


public class DrawLineCommandTest {

    @Test
    public void testCreate() {
        new DrawLineCommand("1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate1() {
        new DrawLineCommand("-1", "1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate2() {
        new DrawLineCommand("1", "-1", "1", "2");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate3() {
        new DrawLineCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate4() {
        new DrawLineCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate6() {
        new DrawLineCommand();
    }
}