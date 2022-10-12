package com.example.designpatterns.behavioral.mediator;

import java.util.List;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */
public class MediatorImpl implements Mediator {


    List<Actor> actors = List.of(new ActorA(this), new ActorB(this));
    @Override
    public void notify(Actor component, NotifyEvent event) {
        actors.stream()
                .filter(actor -> actor.isSupported(event.type()))
                .forEach(actor -> actor.execute(event));
    }
}
