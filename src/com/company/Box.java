package com.company;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double avail;
    private double volume;
    public Box(double avail) {
        this.avail = avail;
        this.volume=avail;
    }

    public boolean add(Shape shape) {
        if (avail >= shape.getVolume()) {
            shapes.add(shape);
            avail -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public double getVolume() {
        return volume;
    }
}
