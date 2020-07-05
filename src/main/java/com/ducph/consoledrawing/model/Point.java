package com.ducph.consoledrawing.model;

import com.ducph.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class Point {

    private int x;
    private int y;
    
    public Point(int x, int y) {
        Utils.shouldAllNonNegative(x, y);
        this.x = x;
        this.y = y;
    }
}