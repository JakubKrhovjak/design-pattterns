package com.example.designpatterns.behavioral.command;

import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class Subtract implements ICommand {

    @Override
    public void execute(int a, int b) {
        log.info("StrategySubtract: " + (a - b));
    }

    @Override
    public boolean isSupported(CommandType type) {
        return CommandType.SUBTRACT == type;
    }
}
