package com.example.designpatterns.behavioral.state;

import com.example.designpatterns.behavioral.state.states.StartState;
import com.example.designpatterns.behavioral.state.states.State;

/**
 * Created by Jakub Krhovják on 10/9/22.
 */

public class StateContext {

    private State currentState = new StartState(this);

    public void changeState(State state) {
        this.currentState = state;
    }

    public void next() {
        currentState.next();
    }

    public void back() {
        currentState.back();
    }

    public void cancel() {
        currentState.cancel();
    }



}
