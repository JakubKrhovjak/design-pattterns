package com.example.designpatterns.behavioral.strategy;

import com.example.designpatterns.behavioral.strategy.strtegies.StartStrategy;
import com.example.designpatterns.behavioral.strategy.strtegies.StopStrategy;

import lombok.RequiredArgsConstructor;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */

@RequiredArgsConstructor
public class StrategyProcessor {

    private final StartStrategy startStrategy;

    private final StopStrategy stopStrategy;

    public void start() {
        startStrategy.start();
    }

    public void stop() {
        stopStrategy.stop();
    }



}
