package com.example.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jakub Krhovják on 10/12/22.
 */
public class DataHandler<E> implements Iterable<E> {

    List<E> items = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        return items.iterator();
    }

    public void addData(E data) {
        items.add(data);
    }
}
