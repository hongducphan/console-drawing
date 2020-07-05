package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;


public class CreateCommandTest {
    
    @Test
    public void testCreate() {
        new CreateCommand("1", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid() {
        new CreateCommand("-11", "1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid2() {
        new CreateCommand("1", "-1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid3() {
        new CreateCommand("1");
    }

    @Test(expected = InvalidCommandParams.class)
    public void testCreateInvalid4() {
        new CreateCommand();
    }
}