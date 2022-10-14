package com.example.designpatterns.creational.builder;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public class Car {

    private String seats;

    private String engine;

    private String navigation;


    public static CarBuilder builder() {
        return new Car.CarBuilder();
    }

    public static class CarBuilder implements Builder {

        Car car;
        private CarBuilder() {
            car = new Car();
        }

        @Override
        public Builder seats(String seats) {
            car.seats = seats;
            return this;
        }

        @Override
        public Builder engine(String engine) {
            car.engine = engine;
            return this;
        }

        @Override
        public Builder navigation(String navigation) {
            car.navigation = navigation;
            return this;
        }

        @Override
        public Car build() {
            return car;
        }
    }

}
