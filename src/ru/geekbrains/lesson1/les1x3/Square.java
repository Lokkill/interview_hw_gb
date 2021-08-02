package ru.geekbrains.lesson1.les1x3;

public class Square extends Shape<Double> implements Drawable {
    @Override
    public Double square(Double h) {
        return h * h;
    }

    @Override
    public void draw() {
        System.out.println("This is a Square");
    }
}
