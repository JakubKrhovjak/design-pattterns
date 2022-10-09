package com.example.designpatterns.behavioral.state;

import com.example.designpatterns.behavioral.state.states.StartState;

import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class Test {

    public static void main(String[] args) {
        var stateContext = new StateContext();


        stateContext.next();
        stateContext.back();
        stateContext.next();
        stateContext.cancel();
        stateContext.next();
        stateContext.next();

    }

//    public static void testStrategyClassic(StrategyType type) {
//        switch (type) {
//            case ADD -> new StrategyContext(new StrategyAdd()).execute(2, 2);
//            case SUBTRACT -> new StrategyContext(new StrategySubtract()).execute(2, 2);
//            case MULTIPLY -> new StrategyContext(new StrategyMultiply()).execute(2, 2);
//            default -> throw new UnsupportedOperationException();
//        }
//    }
//
//    public static void testStrategySupported(StrategyType type) {
//        Stream.of(new StrategyAdd(), new StrategySubtract(), new StrategyMultiply())
//                .filter(strategy -> strategy.isSupported(type))
//                .findAny()
//                .ifPresent(strategy -> strategy.execute(2, 2));
//
//    }
}
