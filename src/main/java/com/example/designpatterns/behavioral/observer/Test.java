package com.example.designpatterns.behavioral.observer;


import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class Test {

    public static void main(String[] args) {
        var eventManager = new EventManager();

        var saveListener = new SaveListener();
        eventManager.subscribe(new DeleteListener());
        eventManager.subscribe(saveListener);
        eventManager.subscribe(new UpdateListener());

        eventManager.notify(EventType.SAVE);

        eventManager.unsubscribe(saveListener);

        eventManager.notify(EventType.SAVE);
    }


}
