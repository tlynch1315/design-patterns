package com.tlynch1315.designPatterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {

    @BeforeEach
    public void beforeEach(final TestInfo testInfo) {
        System.out.println(format(">> Running Test : %s", testInfo.getDisplayName()));
    }

    @Test
    @DisplayName("assembleBasicCarTest")
    public void assembleBasicCarTest() {
        Car basicCar = new BasicCar();
        basicCar.assemble();
    }

    @Test
    @DisplayName("priceBasicCarBeforeAssemblyTest")
    public void priceBasicCarBeforeAssemblyTest() {
        Car basicCar = new BasicCar();
        assertThat(basicCar.price()).isEqualTo(0);
    }

    @Test
    @DisplayName("priceBasicCarAfterAssemblyTest")
    public void priceBasicCarAfterAssemblyTest() {
        Car basicCar = new BasicCar();
        assertThat(basicCar.price()).isEqualTo(0);
    }

    @Test
    @DisplayName("priceLuxuryCarBeforeAssemblyTest")
    public void priceLuxuryCarBeforeAssemblyTest() {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        assertThat(luxuryCar.price()).isEqualTo(0);
    }

    @Test
    @DisplayName("priceLuxuryCarAfterAssemblyTest")
    public void priceLuxuryCarAfterAssemblyTest() {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
        assertThat(luxuryCar.price()).isEqualTo(1100);
    }

    @Test
    @DisplayName("priceSportsCarBeforeAssemblyTest")
    public void priceSportsCarBeforeAssemblyTest() {
        Car sportsCar = new SportsCar(new BasicCar());
        assertThat(sportsCar.price()).isEqualTo(0);
    }

    @Test
    @DisplayName("priceSportsCarAfterAssemblyTest")
    public void priceSportsCarAfterAssemblyTest() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        assertThat(sportsCar.price()).isEqualTo(1600);
    }

    @Test
    @DisplayName("priceSportsLuxuryCarBeforeAssemblyTest")
    public void priceSportsLuxuryCarBeforeAssemblyTest() {
        Car sportsCar = new SportsCar(new LuxuryCar(new BasicCar()));
        assertThat(sportsCar.price()).isEqualTo(0);
    }

    @Test
    @DisplayName("priceSportsLuxuryCarAfterAssemblyTest")
    public void priceSportsLuxuryCarAfterAssemblyTest() {
        Car sportsCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsCar.assemble();
        assertThat(sportsCar.price()).isEqualTo(2600);
    }
}
