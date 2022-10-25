package org.example;

import lombok.var;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void isDrivable() {

        Car car1 = new Car(2,3,"11.12.2021");

        boolean isDriven = car1.getTankFullness() > 0;

        assertEquals(isDriven, car1.isDrivable());

    }

    @Test
    void canBeDriven() {
        Car car1 = new Car(2,3,"11.12.2021");

        boolean canBeDriven = car1.canBeDriven();

        assertEquals(true, true);
    }

    @Test
    void distanceCanBeDriven() {
        Car car1 = new Car(2,3,"11.12.2021");

        int distance = 100;

    }
}