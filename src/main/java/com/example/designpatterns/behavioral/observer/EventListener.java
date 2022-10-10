package com.example.designpatterns.behavioral.observer;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public interface EventListener {


    EventType getType();

    void execute();

}
