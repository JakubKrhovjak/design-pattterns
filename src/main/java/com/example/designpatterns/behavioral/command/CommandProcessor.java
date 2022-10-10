package com.example.designpatterns.behavioral.command;

import com.example.designpatterns.behavioral.command.commands.ICommand;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public class CommandProcessor {

    public void execute(ICommand command) {
        command.execute();
    }

}
