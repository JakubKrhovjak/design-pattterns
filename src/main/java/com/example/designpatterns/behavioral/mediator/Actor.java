package com.example.designpatterns.behavioral.mediator;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */
public interface Actor {

    void notifyActor();

    boolean isSupported(EventType type);

    void execute(NotifyEvent event);

}
