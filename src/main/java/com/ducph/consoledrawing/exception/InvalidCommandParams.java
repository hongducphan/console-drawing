package com.ducph.consoledrawing.exception;

public class InvalidCommandParams extends RuntimeException {

    private final String help;

    public InvalidCommandParams(String message, String help) {
        super(message);
        this.help = help;
    }

    public String getTipMessage() {
        return this.help;
    }
}