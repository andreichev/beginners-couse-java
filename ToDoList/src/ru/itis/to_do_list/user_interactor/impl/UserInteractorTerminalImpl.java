package ru.itis.to_do_list.user_interactor.impl;

import ru.itis.to_do_list.exceptions.UserInteractException;
import ru.itis.to_do_list.user_interactor.UserInteractor;

import java.util.Scanner;

public class UserInteractorTerminalImpl implements UserInteractor {
    private Scanner scanner = new Scanner(System.in);

    public UserInteractorTerminalImpl() throws UserInteractException { }

    @Override
    public String getCommand() {
        return scanner.nextLine();
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
