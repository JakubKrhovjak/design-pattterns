package com.example.designpatterns.creational.builder;

import com.example.designpatterns.structural.composite.Circle;
import com.example.designpatterns.structural.composite.CompoundGraphics;
import com.example.designpatterns.structural.composite.Dot;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public class Test {

    public static void main(String[] args) {

        var car = Car.builder()
                .seats("test seats")
                .engine("new engine")
                .navigation("new navigation")
                .build();

        var car2 = Car.builder()
                .seats("test seats2")
                .engine("new engine2")
                .navigation("new navigation2")
                .build();

    }

}
