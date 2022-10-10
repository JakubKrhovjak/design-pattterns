package com.example.designpatterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
@Slf4j
public class UpdateListener implements EventListener{

    @Override
    public EventType getType() {
        return EventType.SAVE;
    }

    @Override
    public void execute() {
        log.info("UpdateListener");
    }
}
