package com.ducph.consoledrawing.factory;

import com.ducph.consoledrawing.command.BucketFillCommand;
import com.ducph.consoledrawing.command.DrawLineCommand;
import com.ducph.consoledrawing.command.DrawRectangleCommand;
import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;

public class EntityFactoryTest {
    @Test
    public void getEntityLine1() {
        EntityFactory.getEntity(new DrawLineCommand("1", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getEntityLine2() {
        EntityFactory.getEntity(new DrawLineCommand("t", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getEntityLine3() {
        EntityFactory.getEntity(new DrawLineCommand("-1", "2", "1", "22"));
    }

    @Test
    public void getEntityRectangle1() {
        EntityFactory.getEntity(new DrawRectangleCommand("1", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getEntityRectangle2() {
        EntityFactory.getEntity(new DrawRectangleCommand("t", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getEntityRectangle3() {
        EntityFactory.getEntity(new DrawRectangleCommand("-1", "2", "1", "22"));
    }

    @Test
    public void getEntityBucketFill1() {
        EntityFactory.getEntity(new BucketFillCommand("1", "2", "c"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getEntityBucketFill2() {
        EntityFactory.getEntity(new DrawRectangleCommand("t", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void getEntityBucketFill3() {
        EntityFactory.getEntity(new DrawRectangleCommand("-1", "2", "o"));
    }
}