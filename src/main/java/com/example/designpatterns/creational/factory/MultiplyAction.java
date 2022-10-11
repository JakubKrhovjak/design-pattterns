package com.example.designpatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
@Slf4j
public class MultiplyAction implements Action {

    @Override
    public void execute() {
        log.info("MultiplyAction execute");
    }
}
