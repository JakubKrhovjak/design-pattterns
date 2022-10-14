package com.example.designpatterns.creational.builder;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public class CarBuilder implements Builder {

    private String seats;

    private String engine;

    private String navigation;

    @Override
    public Builder seats(String seats) {
        return this;
    }

    @Override
    public Builder engine(String engine) {
        return null;
    }

    @Override
    public Builder navigation(String navigation) {
        return null;
    }

    @Override
    public Car build() {
        return null;
    }
}
