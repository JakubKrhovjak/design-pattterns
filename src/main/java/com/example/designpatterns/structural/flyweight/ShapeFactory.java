package com.example.designpatterns.structural.flyweight;

import java.util.HashMap;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/15/22.
 */

@Slf4j
public class ShapeFactory {

    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        return circleMap.computeIfAbsent(color, ShapeFactory::getCircleInternal);
    }

    private static Circle getCircleInternal (String color) {
        log.info("Creating circle of color : {}", color);
        return new Circle(color);
    }

}
