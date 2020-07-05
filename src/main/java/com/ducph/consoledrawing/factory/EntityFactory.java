package com.ducph.consoledrawing.factory;

import com.ducph.consoledrawing.command.BucketFillCommand;
import com.ducph.consoledrawing.command.DrawEntityCommand;
import com.ducph.consoledrawing.command.DrawLineCommand;
import com.ducph.consoledrawing.command.DrawRectangleCommand;
import com.ducph.consoledrawing.model.BucketFill;
import com.ducph.consoledrawing.model.Entity;
import com.ducph.consoledrawing.model.Line;
import com.ducph.consoledrawing.model.Rectangle;

public class EntityFactory {
    
    private EntityFactory() {
    }

    public static Entity getEntity(DrawEntityCommand command) {
        if (command instanceof DrawLineCommand) {
            DrawLineCommand cmd = (DrawLineCommand) command;
            return new Line(cmd.getX1(), cmd.getY1(), cmd.getX2(), cmd.getY2());
        } else if (command instanceof DrawRectangleCommand) {
            DrawRectangleCommand cmd = (DrawRectangleCommand) command;
            return new Rectangle(cmd.getX1(), cmd.getY1(), cmd.getX2(), cmd.getY2());
        } else if (command instanceof BucketFillCommand) {
            BucketFillCommand cmd = (BucketFillCommand) command;
            return new BucketFill(cmd.getX(), cmd.getY(), cmd.getColor());
        }
        return null;
    }
}
