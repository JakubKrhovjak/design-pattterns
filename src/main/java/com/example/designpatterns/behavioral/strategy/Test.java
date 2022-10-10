package com.example.designpatterns.behavioral.strategy;

import com.example.designpatterns.behavioral.state.StateContext;
import com.example.designpatterns.behavioral.strategy.strtegies.ImmediateStopStrategy;
import com.example.designpatterns.behavioral.strategy.strtegies.LongStartStrategy;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public class Test {


    public static void main(String[] args) {
        var strategyProcessor = new StrategyProcessor(new LongStartStrategy(), new ImmediateStopStrategy());
        strategyProcessor.start();
        strategyProcessor.stop();

    }
}
