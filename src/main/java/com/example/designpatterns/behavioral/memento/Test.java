package com.example.designpatterns.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

@Slf4j
public class Test {

    public static void main(String[] args) {

        var pointsDrawer = new PointsDrawer();
        pointsDrawer.writePoint(new Point(2, 2));
        pointsDrawer.writePoint(new Point(3, 3));
        pointsDrawer.writePoint(new Point(4, 4));
        pointsDrawer.printPoints();
        log.error("------------------------------------");
        pointsDrawer.undoPoint();
        pointsDrawer.printPoints();



    }
}
