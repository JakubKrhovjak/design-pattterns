package com.example.designpatterns.behavioral.iterator;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */

@Slf4j
public class Test {

    public static void main(String[] args) {

        var handler = new DataHandler<Item>();

        handler.addData(new Item(1, "one"));
        handler.addData(new Item(2, "two"));

        for(Item item:  handler) {
            log.info("Item: {}", item);
        }

    }

}
