package com.example.designpatterns.behavioral.mediator;

import com.example.designpatterns.structural.facade.DataFacade;
import com.example.designpatterns.structural.facade.DataName;
import com.example.designpatterns.structural.facade.MultipleProvider;
import com.example.designpatterns.structural.facade.SimpleProvider;

import java.util.List;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */
public class Test {

    public static void main(String[] args) {

        var mediator = new MediatorImpl();
        new ActorA(mediator).notifyActor();

    }

}
