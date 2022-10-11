package com.example.designpatterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
@Slf4j
public class PointsDrawer {

    private LinkedList<Point> points = new LinkedList<>();

    public void writePoint(Point point) {
        points.add(point);
    }

    public void undoPoint() {
        points.removeLast();
    }

    public void printPoints() {
        points.forEach(p -> log.info("" + p));
    }

}
