package com.example.designpatterns.structural.bridge.controller;

import com.example.designpatterns.structural.bridge.device.Device;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */

@Slf4j
@RequiredArgsConstructor
public class LocalController implements Controller {

    private final Device device;

    @Override
    public void on() {
        device.on();
    }

    @Override
    public void off() {
        device.off();
    }
}
