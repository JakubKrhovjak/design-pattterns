package com.example.designpatterns.behavioral.observer.listener;


import com.example.designpatterns.behavioral.observer.ListenerType;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */

@Slf4j
public class DeleteListener implements EventListener {

    @Override
    public ListenerType getType() {
        return ListenerType.DELETE;
    }

    @Override
    public void execute() {
        log.info("DeleteListener");
    }
}
