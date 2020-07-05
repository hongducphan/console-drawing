package com.ducph.consoledrawing.factory;

import com.ducph.consoledrawing.command.BucketFillCommand;
import com.ducph.consoledrawing.command.Command;
import com.ducph.consoledrawing.command.CreateCommand;
import com.ducph.consoledrawing.command.DrawLineCommand;
import com.ducph.consoledrawing.command.DrawRectangleCommand;
import com.ducph.consoledrawing.exception.InvalidCommandParams;
import com.ducph.consoledrawing.model.CommandType;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class CommandFactoryTest {

    @Test
    public void testGetCommandQ() {
        CommandFactory.getCommand(CommandType.Q, new String[]{"1"});
    }

    @Test
    public void testGetCommandC() {
        Command command = CommandFactory.getCommand(CommandType.C, new String[]{"20", "4"});
        Assert.assertThat(command, CoreMatchers.instanceOf(CreateCommand.class));
    }

    @org.junit.Test(expected = InvalidCommandParams.class)
    public void testGetCommandCInvalid() {
        CommandFactory.getCommand(CommandType.C, new String[]{"20", "-4"});
    }

    @Test
    public void testGetCommandL() {
        Command command = CommandFactory.getCommand(CommandType.L, new String[]{"1", "2", "1", "22"});

        Assert.assertThat(command, CoreMatchers.instanceOf(DrawLineCommand.class));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetCommandLInvalid() {
        CommandFactory.getCommand(CommandType.L, new String[]{"1", "2", "1", "-22"});
    }

    @Test
    public void testGetCommandR() {
        Command command = CommandFactory.getCommand(CommandType.R, new String[]{"14", "1", "18", "3"});
        Assert.assertThat(command, CoreMatchers.instanceOf(DrawRectangleCommand.class));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetCommandRInvalid() {
        CommandFactory.getCommand(CommandType.R, new String[]{"14", "1", "18", "-3"});

    }

    @Test
    public void testGetCommandB() {
        Command command = CommandFactory.getCommand(CommandType.B, new String[]{"1", "3", "o"});
        Assert.assertThat(command, CoreMatchers.instanceOf(BucketFillCommand.class));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetCommandBInvalid() {
        CommandFactory.getCommand(CommandType.B, new String[]{"1", "3", "oo"});
    }
}