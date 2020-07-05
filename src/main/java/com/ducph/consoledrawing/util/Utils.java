package com.ducph.consoledrawing.util;

import com.ducph.consoledrawing.model.CommandType;

import java.util.Arrays;

public class Utils {

    public static int toPositiveInt(String input) throws IllegalArgumentException {
        int i = Integer.parseInt(input);
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        return i;
    }

    public static void shouldAllPositive(int... numbers) {
        for (int num : numbers) {
            if (num < 1) {
                throw new IllegalArgumentException("Number should be positive!");
            }
        }
    }

    public static void shouldAllNonNegative(int... numbers) {
        for (int num : numbers) {
            if (num < 0) {
                throw new IllegalArgumentException("Number should be non-negative!");
            }
        }
    }

    public static CommandType extractCommandType(String commandLine) {
        commandLine = commandLine.trim().replaceAll("\\s+", " ");
        String[] split = commandLine.split(" ");
        String mainCommand = split[0].toUpperCase();

        return CommandType.valueOf(mainCommand);
    }

    public static String[] extractCommandParams(String[] array) {
        return Arrays.copyOfRange(array, 1, array.length);
    }
}
