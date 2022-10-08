package com.example.designpatterns.behavioral.strategy;

import com.example.designpatterns.DesignPatternsApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class Test {

    public static void main(String[] args) {
        Arrays.stream(StrategyType.values()).forEach(Test::testStrategyClassic);

        Arrays.stream(StrategyType.values()).forEach(Test::testStrategySupported);
    }

    public static void testStrategyClassic(StrategyType type) {
        switch (type) {
            case ADD -> new StrategyContext(new StrategyAdd()).execute(2, 2);
            case SUBTRACT -> new StrategyContext(new StrategySubtract()).execute(2, 2);
            case MULTIPLY -> new StrategyContext(new StrategyMultiply()).execute(2, 2);
            default -> throw new UnsupportedOperationException();
        }
    }

    public static void testStrategySupported(StrategyType type) {
        Stream.of(new StrategyAdd(), new StrategySubtract(), new StrategyMultiply())
                .filter(strategy -> strategy.isSupported(type))
                .findAny()
                .ifPresent(strategy -> strategy.execute(2, 2));

    }
}
