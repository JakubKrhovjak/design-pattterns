package com.example.designpatterns.structural.bridge.device;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
@Slf4j
public class Tv implements Device {

    @Override
    public void on() {
        log.info("Tv on");
    }

    @Override
    public void off() {
        log.info("Tv of");
    }
}
