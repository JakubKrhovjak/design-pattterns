package com.example.designpatterns.behavioral.observer.listener;

import com.example.designpatterns.behavioral.observer.ListenerType;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public interface EventListener {


    ListenerType getType();

    void execute();

}
