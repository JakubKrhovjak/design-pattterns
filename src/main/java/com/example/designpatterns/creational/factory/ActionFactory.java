package com.example.designpatterns.creational.factory;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class ActionFactory {

    public static Action getAction(ActionType type) {
       return switch (type) {
            case SIMPLE -> new SimpleAction();
            case MULTIPLY -> new MultiplyAction();
            default -> throw new IllegalArgumentException();
        };
    }

}
