package com.smile.service;

import java.util.ArrayList;
import java.util.Random;

public class StaticFieldHolding {

    private Random random = new Random();
    public static final ArrayList<Double> list = new ArrayList<>(1000000);

    public void populateData() {
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextDouble());
        }
    }
}
