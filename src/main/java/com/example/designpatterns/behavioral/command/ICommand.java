package com.example.designpatterns.behavioral.command;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */

public interface ICommand {

    void execute(int a, int b);

    boolean isSupported(CommandType type);

}
