package com.example.designpatterns.behavioral.observer;


import com.example.designpatterns.behavioral.observer.listener.DeleteListener;
import com.example.designpatterns.behavioral.observer.listener.SaveListener;
import com.example.designpatterns.behavioral.observer.listener.UpdateListener;

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

        eventManager.notify(ListenerType.SAVE);

        eventManager.unsubscribe(saveListener);

        eventManager.notify(ListenerType.SAVE);
    }


}
