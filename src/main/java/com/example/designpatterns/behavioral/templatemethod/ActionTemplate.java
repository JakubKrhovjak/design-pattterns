package com.example.designpatterns.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

@Slf4j
public abstract class ActionTemplate {

    public void process() {
        startAction();
        executeAction();
        verifyAction();
        finishAction();
    }

    protected void startAction() {
        log.info("ActionTemplate startAction");
    }

    protected abstract void executeAction();

    protected void verifyAction() {
        log.info("ActionTemplate verifyAction");
    }


    protected void finishAction() {
        log.info("ActionTemplate finishAction");
    }


}
