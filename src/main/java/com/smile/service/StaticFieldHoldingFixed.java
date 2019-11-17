package com.smile.service;

import java.util.ArrayList;
import java.util.Random;

public class StaticFieldHoldingFixed {

    private Random random = new Random();
    public final ArrayList<Double> list = new ArrayList<>(1000000);

    public void populateData() throws InterruptedException {
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextDouble());
        }
    }
}
