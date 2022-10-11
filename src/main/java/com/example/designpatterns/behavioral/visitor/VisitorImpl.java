package com.example.designpatterns.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
@Slf4j
public class VisitorImpl implements Visitor {

    @Override
    public void visit(AddAction action) {
        log.info("VisitorImpl AddAction");
    }

    @Override
    public void visit(MultiplyAction action) {
        log.info("VisitorImpl MultiplyAction");
    }
}
