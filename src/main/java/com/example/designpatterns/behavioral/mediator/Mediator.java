package com.example.designpatterns.behavioral.mediator;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */
public interface Mediator {

    void notify(Actor component, NotifyEvent notifyEvent);

}
