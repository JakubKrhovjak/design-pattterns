package com.example.designpatterns.structural.flyweight;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/15/22.
 */

@Slf4j
@Data
public class Circle  {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    private int x;
    private int y;
    private int radius;


    public void draw() {
       log.info("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
