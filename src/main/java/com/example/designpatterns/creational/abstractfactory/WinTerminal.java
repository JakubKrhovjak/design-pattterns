package com.example.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

@Slf4j
public class WinTerminal implements Terminal {

    @Override
    public void write(String input) {
        log.info("WinTerminal write: {}", input);
    }

    @Override
    public String read() {
        log.info("WinTerminal read");
        return "WinTerminal read";
    }
}
