package com.ducph.consoledrawing.factory;

import com.ducph.consoledrawing.command.BucketFillCommand;
import com.ducph.consoledrawing.command.Command;
import com.ducph.consoledrawing.command.CreateCommand;
import com.ducph.consoledrawing.command.DrawLineCommand;
import com.ducph.consoledrawing.command.DrawRectangleCommand;
import com.ducph.consoledrawing.command.QuitCommand;
import com.ducph.consoledrawing.model.CommandType;


public class CommandFactory {
    
    private CommandFactory() {
    }

    public static Command getCommand(CommandType commandType, String[] params) {
        switch (commandType) {
            case Q:
                return new QuitCommand();
            case C:
                return new CreateCommand(params);
            case L:
                return new DrawLineCommand(params);
            case R:
                return new DrawRectangleCommand(params);
            case B:
                return new BucketFillCommand(params);
            default:
                throw new IllegalArgumentException();
        }
    }
}