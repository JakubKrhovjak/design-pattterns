package com.example.designpatterns.behavioral.state.states;

import com.example.designpatterns.behavioral.state.StateContext;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/9/22.
 */

@Slf4j
public class State1 implements State {

    private final StateContext stateContext;

    public State1(StateContext stateContext) {
        log.info("---State1---");
        this.stateContext = stateContext;
    }


    @Override
    public void next() {
        log.info("State1: next");
        stateContext.changeState(new FinalState(stateContext));

    }

    @Override
    public void back() {
        log.info("State1: back");
        stateContext.changeState(new StartState(stateContext));

    }

    @Override
    public void cancel() {
        log.info("State1: cancel");
        stateContext.changeState(new CancelState());
    }
}
