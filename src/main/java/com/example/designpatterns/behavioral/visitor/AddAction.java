package com.example.designpatterns.behavioral.visitor;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class AddAction implements Action {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
