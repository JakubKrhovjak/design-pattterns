package com.example.designpatterns.behavioral.visitor;

import com.example.designpatterns.behavioral.templatemethod.ComposedAction;
import com.example.designpatterns.behavioral.templatemethod.SimpleAction;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class Test {

    public static void main(String[] args) {
        var visitor = new VisitorImpl();

        var addAction = new AddAction();
        addAction.accept(visitor);


        var multiplyAction = new MultiplyAction();
        multiplyAction.accept(visitor);
    }
}
