package com.example.designpatterns.behavioral.state.states;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/9/22.
 */

@Slf4j
public class CancelState implements State {

    public CancelState() {
        log.info("---CancelState---");
    }

    @Override
    public void next() {
        log.info("CancelState: next");
    }

    @Override
    public void back() {
        log.info("CancelState: back");
    }

    @Override
    public void cancel() {
        log.info("CancelState: cancel");

    }
}
