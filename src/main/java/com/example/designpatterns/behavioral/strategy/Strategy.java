package com.example.designpatterns.behavioral.strategy;

import lombok.RequiredArgsConstructor;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */

public interface Strategy {

    void execute(int a, int b);

    boolean isSupported(StrategyType type);

}
