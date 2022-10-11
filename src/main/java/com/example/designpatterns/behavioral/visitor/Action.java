package com.example.designpatterns.behavioral.visitor;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public interface Action {

   void accept(Visitor visitor);

}
