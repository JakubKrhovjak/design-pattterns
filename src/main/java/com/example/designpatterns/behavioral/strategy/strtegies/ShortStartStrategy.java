package com.example.designpatterns.behavioral.strategy.strtegies;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */

@Slf4j
public class ShortStartStrategy implements StartStrategy{

    @Override
    public void start() {
        log.info("ShortStartStrategy execute");
    }
}
