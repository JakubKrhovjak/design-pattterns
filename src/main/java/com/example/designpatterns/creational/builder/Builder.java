package com.example.designpatterns.creational.builder;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public interface Builder {

    Builder seats(String seats);

    Builder engine(String engine);

    Builder navigation(String navigation);

    Car build();


}
