package com.tlynch1315.designPatterns.decorator;

public class SportsCar extends CarDecorator {

    private static final Integer price = 1500;
    private Boolean assembled;

    public SportsCar(Car car) {
        super(car);
        assembled = Boolean.FALSE;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Assembling sports parts...");
        assembled = Boolean.TRUE;
    }

    @Override
    public Integer price() {
        return assembled ? SportsCar.price + super.price() : 0;
    }
}
