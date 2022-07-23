package ru.itis.to_do_list.user_interactor.impl;

import ru.itis.to_do_list.exceptions.UserInteractException;
import ru.itis.to_do_list.user_interactor.UserInteractor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UserInteractPunchedCard implements UserInteractor {

    protected final String[] lines;
    protected int currentLine = 0;

    public UserInteractPunchedCard(String path) throws UserInteractException {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            this.lines = lines.toArray(new String[lines.size()]);
            this.currentLine = 0;
        } catch (IOException ex) {
            throw new UserInteractException("Can't load punched card.");
        }
    }

    @Override
    public String getCommand() {
        if (currentLine >= lines.length) {
            return null;
        }
        String command = lines[currentLine];
        currentLine++;
        System.out.println("<< " + command);
        return command;
    }

    @Override
    public void print(String output) {
        System.out.println(">> " + output);
    }

}
