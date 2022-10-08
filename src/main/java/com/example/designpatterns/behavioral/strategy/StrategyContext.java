package com.example.designpatterns.behavioral.strategy;

import lombok.RequiredArgsConstructor;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */

@RequiredArgsConstructor
public class StrategyContext {

    private final Strategy strategy;

    public void execute(int a, int b) {
         strategy.execute(a, b);
    }

}
