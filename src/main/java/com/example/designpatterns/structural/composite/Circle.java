package com.example.designpatterns.structural.composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
@Slf4j
public class Circle extends Dot {

    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
       log.info("Draw {} {}", x, y);
    }
}
