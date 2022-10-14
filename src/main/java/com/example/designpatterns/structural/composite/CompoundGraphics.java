package com.example.designpatterns.structural.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */

@Slf4j
public class CompoundGraphics implements Graphic {

    List<Graphic> components = new ArrayList<>();

    public void add(Graphic graphic) {
        components.add(graphic);
    }

    public void remove(Graphics graphics) {
        components.remove(graphics);
    }

    @Override
    public void move(int x, int y) {
        components.forEach(c -> c.move(x, y));
    }

    @Override
    public void draw() {
        log.info("------------Draw-------------------");
        components.forEach(Graphic::draw);
        log.info("-----------------------------------");
    }
}
