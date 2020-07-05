package com.ducph.consoledrawing.model;

import com.ducph.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class BucketFill implements Entity {

    private int x;
    private int y;
    private char color;

    public BucketFill(int x1, int y1, char color) {
        Utils.shouldAllPositive(x1, y1);
        this.x = x1;
        this.y = y1;
        this.color = color;
    }
}