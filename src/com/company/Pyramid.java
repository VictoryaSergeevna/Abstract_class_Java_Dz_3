package com.company;

public class Pyramid extends Shape{
    private double height;
    private double square;

    public Pyramid(double height, double square) {
        this.height = height;
        this.square = square;
    }
    @Override
    public double getVolume() {
        return height * square * 4 / 3;
    }
}
