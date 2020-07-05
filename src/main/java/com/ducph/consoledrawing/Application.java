package com.ducph.consoledrawing;

import com.ducph.consoledrawing.command.*;
import com.ducph.consoledrawing.exception.InvalidCommandParams;
import com.ducph.consoledrawing.factory.CommandFactory;
import com.ducph.consoledrawing.service.CanvasService;
import com.ducph.consoledrawing.service.CanvasServiceImpl;
import com.ducph.consoledrawing.factory.EntityFactory;
import com.ducph.consoledrawing.exception.InvalidEntityException;
import com.ducph.consoledrawing.model.CommandType;
import com.ducph.consoledrawing.util.Utils;

import java.util.Scanner;

public class Application {

    private static CanvasService canvasService;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter command: ");

        while (true) {
            process(scanner.nextLine());
            System.out.print("Enter command: ");
        }
    }

    private static void process(String commandLine) {
        Command command = null;

        try {
            CommandType commandType = Utils.extractCommandType(commandLine);
            String[] commandParams = Utils.extractCommandParams(commandLine.split(" "));
            command = CommandFactory.getCommand(commandType, commandParams);
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid command.");
        } catch (InvalidCommandParams e) {
            System.out.println("Command syntax is not correct: " + e.getMessage());
            System.out.println("Refer to following correct syntax: \n" + e.getTipMessage());
        }

        if (command instanceof QuitCommand) {
            quit();
        } else if (command instanceof CreateCommand) {
            createNewCanvas((CreateCommand) command);
        } else if (command instanceof DrawEntityCommand) {
            draw((DrawEntityCommand) command);
        }
    }

    private static void draw(DrawEntityCommand command) {
        if (canvasService == null) {
            System.out.println("Canvas is not exist!");
            return;
        }
        try {
            canvasService.addEntity(EntityFactory.getEntity(command));
            System.out.println(canvasService.render());
        } catch (InvalidEntityException e) {
            System.out.println("Can not add the model to canvas: " + e.getMessage());
        }
    }

    private static void createNewCanvas(CreateCommand command) {
        canvasService = new CanvasServiceImpl(command.getWidth(), command.getHeight());
        System.out.println(canvasService.render());
    }

    private static void quit() {
        scanner.close();
        System.exit(0);
    }
}
