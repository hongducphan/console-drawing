package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;


public class CreateCommandTest {
    
    @Test
    public void testCreate() {
        new CreateCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate2() {
        new CreateCommand("-11", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate3() {
        new CreateCommand("1", "-1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate4() {
        new CreateCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreate6() {
        new CreateCommand();
    }
}