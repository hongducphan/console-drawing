package com.ducph.consoledrawing.factory;

import com.ducph.consoledrawing.command.BucketFillCommand;
import com.ducph.consoledrawing.command.DrawLineCommand;
import com.ducph.consoledrawing.command.DrawRectangleCommand;
import com.ducph.consoledrawing.exception.InvalidCommandParams;
import org.junit.Test;

public class EntityFactoryTest {
    @Test
    public void testGetEntityLine() {
        EntityFactory.getEntity(new DrawLineCommand("1", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetEntityLineInvalid() {
        EntityFactory.getEntity(new DrawLineCommand("t", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetEntityLineInvalid2() {
        EntityFactory.getEntity(new DrawLineCommand("-1", "2", "1", "22"));
    }

    @Test
    public void testGetEntityRectangle() {
        EntityFactory.getEntity(new DrawRectangleCommand("1", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetEntityRectangleInvalid() {
        EntityFactory.getEntity(new DrawRectangleCommand("t", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetEntityRectangleInvalid2() {
        EntityFactory.getEntity(new DrawRectangleCommand("-1", "2", "1", "22"));
    }

    @Test
    public void testGetEntityBucketFill() {
        EntityFactory.getEntity(new BucketFillCommand("1", "2", "c"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetEntityBucketFillInvalid() {
        EntityFactory.getEntity(new DrawRectangleCommand("t", "2", "1", "22"));
    }

    @Test(expected = InvalidCommandParams.class)
    public void testGetEntityBucketFillInvalid2() {
        EntityFactory.getEntity(new DrawRectangleCommand("-1", "2", "o"));
    }
}