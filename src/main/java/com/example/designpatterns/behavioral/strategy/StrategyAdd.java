package com.example.designpatterns.behavioral.strategy;

import java.util.function.Supplier;

import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class StrategyAdd implements Strategy {


    @Override
    public void execute(int a, int b) {
        log.info("StrategyAdd: " + (a + b) );
    }

    @Override
    public boolean isSupported(StrategyType type) {
        return StrategyType.ADD == type;
    }
}
