package com.tlynch1315.designPatterns.decorator;

public class LuxuryCar extends CarDecorator {

    private static final Integer price = 1000;
    private Boolean assembled;

    public LuxuryCar(Car car) {
        super(car);
        assembled = Boolean.FALSE;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Assembling Luxury parts...");
        assembled = Boolean.TRUE;
    }

    @Override
    public Integer price() {
        return assembled ? LuxuryCar.price + super.price() : 0;
    }
}
