package ru.geekbrains.lesson1.les1x3;

public class Triangle extends Shape<Double> implements Drawable{

    @Override
    public Double square(Double b, Double h) {
        return 0.5 * b * h;
    }

    @Override
    public void draw() {

    }
}
