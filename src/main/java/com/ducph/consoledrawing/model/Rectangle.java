package com.ducph.consoledrawing.model;

import com.ducph.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class Rectangle implements Entity {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        Utils.shouldAllPositive(x1, y1, x2, y2);
        if ((this.x1 == this.x2 && this.y1 > this.y2) || (this.y1 == this.y2 && this.x1 > this.x2)) {
            this.x1 = x2;
            this.y1 = y2;
            this.x2 = x1;
            this.y2 = y1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
}