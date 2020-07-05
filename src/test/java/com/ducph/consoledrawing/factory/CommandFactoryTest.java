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
    public void getCommand() {
        CommandFactory.getCommand(CommandType.Q, new String[]{"1"});
    }

    @Test
    public void getCommand3() {
        Command command = CommandFactory.getCommand(CommandType.C, new String[]{"20", "4"});
        Assert.assertThat(command, CoreMatchers.instanceOf(CreateCommand.class));
    }

    @org.junit.Test(expected = InvalidCommandParams.class)
    public void getCommand32() {
        CommandFactory.getCommand(CommandType.C, new String[]{"20", "-4"});
    }

    @Test
    public void getCommand4() {
        Command command = CommandFactory.getCommand(CommandType.L, new String[]{"1", "2", "1", "22"});

        Assert.assertThat(command, CoreMatchers.instanceOf(DrawLineCommand.class));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getCommand42() {
        CommandFactory.getCommand(CommandType.L, new String[]{"1", "2", "1", "-22"});
    }

    @Test
    public void getCommand5() {
        Command command = CommandFactory.getCommand(CommandType.R, new String[]{"14", "1", "18", "3"});
        Assert.assertThat(command, CoreMatchers.instanceOf(DrawRectangleCommand.class));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getCommand52() {
        CommandFactory.getCommand(CommandType.R, new String[]{"14", "1", "18", "-3"});

    }

    @Test
    public void getCommand6() {
        Command command = CommandFactory.getCommand(CommandType.B, new String[]{"1", "3", "o"});
        Assert.assertThat(command, CoreMatchers.instanceOf(BucketFillCommand.class));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getCommand62() {
        CommandFactory.getCommand(CommandType.B, new String[]{"1", "3", "oo"});
    }
}