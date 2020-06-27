package com.tlynch1315.designPatterns.decorator;

public class BasicCar implements Car{

    private static final Integer price = 100;
    private Boolean assembled = Boolean.FALSE;

    public void assemble() {
        System.out.println("Assembling basic parts...");
        assembled = Boolean.TRUE;
    }

    public Integer price() {
        return assembled ? BasicCar.price : 0;
    }
}
