package com.example.designpatterns.structural.composite;

import com.example.designpatterns.structural.bridge.controller.LocalController;
import com.example.designpatterns.structural.bridge.controller.RemoteController;
import com.example.designpatterns.structural.bridge.device.Pc;
import com.example.designpatterns.structural.bridge.device.Tv;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public class Test {

    public static void main(String[] args) {
        CompoundGraphics compoundGraphics = new CompoundGraphics();
        compoundGraphics.add(new Dot(1, 1));
        compoundGraphics.add(new Circle(2, 2, 4));

        compoundGraphics.draw();
        compoundGraphics.move(2, 2);
        compoundGraphics.draw();
    }

}
