package com.example.designpatterns.behavioral.visitor;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public interface Visitor {

    void visit(AddAction action);

    void visit(MultiplyAction action);

}
