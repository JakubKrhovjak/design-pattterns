package com.example.designpatterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */

@Slf4j
public class JsonConsumer {

    public void process(String json) {
        log.info("processing json: {}", json);
    }

}
