package com.example.designpatterns.behavioral.templatemethod;

import com.example.designpatterns.behavioral.strategy.StrategyProcessor;
import com.example.designpatterns.behavioral.strategy.strtegies.ImmediateStopStrategy;
import com.example.designpatterns.behavioral.strategy.strtegies.LongStartStrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

@Slf4j
public class Test {

    public static void main(String[] args) {
        var simpleAction = new SimpleAction();
        simpleAction.process();

        log.error("---------------------------------------");

        var composedAction = new ComposedAction();
        composedAction.process();

    }

}
