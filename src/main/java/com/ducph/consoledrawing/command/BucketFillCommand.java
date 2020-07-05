package com.ducph.consoledrawing.command;

import com.ducph.consoledrawing.exception.InvalidCommandParams;
import com.ducph.consoledrawing.util.Utils;
import lombok.Data;

@Data
public class BucketFillCommand implements DrawEntityCommand {
    private static final String tipMessage = "B x y c: Should fill the entire area connected to (x,y) with colour c";
    private int x;
    private int y;
    private char color;

    public BucketFillCommand(String... params) {
        if (params.length < 3)
            throw new InvalidCommandParams("Bucket fill expects 3 params", tipMessage);
        if (params[2].length() != 1)
            throw new InvalidCommandParams("Color character should only be 1 character", tipMessage);
        try {
            x = Utils.toPositiveInt(params[0]);
            y = Utils.toPositiveInt(params[1]);
            color = params[2].charAt(0);
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandParams("x or y should be > 0", tipMessage);
        }
    }
}
