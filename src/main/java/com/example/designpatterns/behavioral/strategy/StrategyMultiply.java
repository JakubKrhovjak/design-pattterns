package com.example.designpatterns.behavioral.strategy;

import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class StrategyMultiply implements Strategy{

    @Override
    public void execute(int a, int b) {
        log.info("StrategyMultiply: " + a * b );
    }

    @Override
    public boolean isSupported(StrategyType type) {
        return StrategyType.MULTIPLY == type;
    }
}
