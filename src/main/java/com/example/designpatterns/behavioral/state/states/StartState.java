package com.example.designpatterns.behavioral.state.states;

import com.example.designpatterns.behavioral.state.StateContext;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/9/22.
 */
@Slf4j
public class StartState implements State {

    private final StateContext stateContext;

    public StartState(StateContext stateContext) {
        log.info("---StartState---");
        this.stateContext = stateContext;
    }

    @Override
    public void next() {
        log.info("StartState: next");
        stateContext.changeState(new State1(stateContext));
    }

    @Override
    public void back() {
        log.info("StartState: back");

    }

    @Override
    public void cancel() {
        log.info("StartState: back");
        stateContext.changeState(new CancelState());
    }
}
