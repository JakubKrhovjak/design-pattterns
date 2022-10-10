package com.example.designpatterns.behavioral.command;

import java.util.Arrays;
import java.util.stream.Stream;

import lombok.extern.java.Log;

/**
 * Created by Jakub Krhovják on 10/8/22.
 */
@Log
public class Test {

    public static void main(String[] args) {
        Arrays.stream(CommandType.values()).forEach(Test::testCommandSupported);


    }


    public static void testCommandSupported(CommandType type) {
        Stream.of(new Add(), new Subtract(), new Multiply())
                .filter(command -> command.isSupported(type))
                .findAny()
                .ifPresent(command -> command.execute(2, 2));

    }
}
