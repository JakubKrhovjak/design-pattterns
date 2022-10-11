package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.factory.Action;
import com.example.designpatterns.creational.factory.ActionFactory;
import com.example.designpatterns.creational.factory.ActionType;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class Test {

    public static void main(String[] args) {

        runTerminal(new LinuxFactory());
        runTerminal(new WinFactory());

    }

    public static void runTerminal(ComputerFactory computerFactory) {
        computerFactory.terminal().write("test terminal input");
    }

}
