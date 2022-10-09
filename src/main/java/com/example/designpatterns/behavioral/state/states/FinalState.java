package com.example.designpatterns.behavioral.state.states;

import com.example.designpatterns.behavioral.state.StateContext;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/9/22.
 */

@Slf4j
public class FinalState implements State {

    private final StateContext stateContext;

    public FinalState(StateContext stateContext) {
        log.info("---FinalState---");
        this.stateContext = stateContext;
    }

    @Override
    public void next() {
        log.info("FinalState: next");
    }

    @Override
    public void back() {
        log.info("FinalState: next");
        stateContext.changeState(new State1(stateContext));

    }

    @Override
    public void cancel() {
        log.info("FinalState: cancel");
    }
}
