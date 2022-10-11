package com.example.designpatterns.creational.factory;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class Test {

    public static void main(String[] args) {
        ActionFactory.getAction(ActionType.SIMPLE).execute();
        Action action = ActionFactory.getAction(ActionType.MULTIPLY);
        action.execute();
    }


}


