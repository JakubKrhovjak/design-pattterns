package com.example.designpatterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */

@Slf4j
@AllArgsConstructor
public class Dot implements Graphic {

    protected int x;

    protected int y;

    @Override
    public void move(int x, int y) {
        log.info("Move {} {}", x, y);
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        log.info("Draw {} {} ", x , y);
    }
}
