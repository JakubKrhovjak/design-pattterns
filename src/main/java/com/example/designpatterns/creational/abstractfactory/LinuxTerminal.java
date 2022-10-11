package com.example.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

@Slf4j
public class LinuxTerminal implements Terminal {

    @Override
    public void write(String input) {
        log.info("LinuxTerminal write: {}", input);
    }

    @Override
    public String read() {
        log.info("LinuxTerminal read");
        return "LinuxTerminal read";
    }

}
