package com.example.designpatterns.creational.abstractfactory;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class LinuxFactory implements ComputerFactory {

    @Override
    public Terminal terminal() {
        return new LinuxTerminal();
    }
}
