package com.example.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public class EventManager {
    private Map<EventType, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(EventListener listener) {
        var type = listener.getType();
        var typeListeners = listeners.getOrDefault(type, new ArrayList<>());
        typeListeners.add(listener);
        listeners.put(type, typeListeners);
    }

    public void unsubscribe(EventListener listener) {
        var type = listener.getType();
        var orDefault = listeners.getOrDefault(type, new ArrayList<>());
        orDefault.remove(listener);
        listeners.put(type, orDefault);
    }

    public void notify(EventType type) {
        listeners.getOrDefault(type, new ArrayList<>()).forEach(EventListener::execute);
    }

}
