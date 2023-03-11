package com.nbicocchi.javafx.collections;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

public class RETRAL extends ExperimentTask {

    @Override
    protected Pair<Integer, Integer> experiment(int items) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < items; i++) {
            list.add(randomGenerator.nextInt(items));
        }
        long start = System.nanoTime();
        for (int i = 0; i < MAX_RETRIEVE_ITEMS; i++) {
            list.contains(randomGenerator.nextInt(items));
        }
        long end = System.nanoTime();
        return new Pair(items, (int) NANOSECONDS.toMicros(end - start));
    }
}
