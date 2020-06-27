package com.tlynch1315.designPatterns.decorator;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void assemble() {
        this.car.assemble();
    }

    public Integer price() {
        return this.car.price();
    }
}
