package com.example.designpatterns.behavioral.command.commands;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */

@Slf4j
public class StartCommand implements ICommand{

    @Override
    public void execute() {
        log.info("StartCommand execute");
    }
}
