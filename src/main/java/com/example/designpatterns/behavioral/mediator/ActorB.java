package com.example.designpatterns.behavioral.mediator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */

@Slf4j
@RequiredArgsConstructor
public class ActorB implements Actor {

    private final Mediator mediator;

    @Override
    public void notifyActor() {
        mediator.notify(this, new NotifyEvent(EventType.A, "from actor B"));
    }

    @Override
    public boolean isSupported(EventType type) {
        return EventType.B == type;
    }

    @Override
    public void execute(NotifyEvent event) {
        log.info(event.data());
    }
}
