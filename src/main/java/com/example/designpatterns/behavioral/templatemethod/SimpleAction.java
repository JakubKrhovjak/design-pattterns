package com.example.designpatterns.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
@Slf4j
public class SimpleAction extends ActionTemplate {

    @Override
    public void executeAction() {
        log.info("SimpleAction executeAction");
    }
}
