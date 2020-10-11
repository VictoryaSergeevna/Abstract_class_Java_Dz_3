package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Cylinder cylyinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(200, 250);

        Box box = new Box(1000);

        System.out.println("Ball:"+box.add(ball));
        System.out.println("Cylyinder:"+box.add(cylyinder));
        System.out.println("Pyramid:"+box.add(pyramid));
    }
}
