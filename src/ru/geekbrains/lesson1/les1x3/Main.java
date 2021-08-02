package ru.geekbrains.lesson1.les1x3;

public class Main {
    public static void main(String[] args) {
        Shape<Double> circle = new Circle();
        System.out.println(circle.square(10d));

        Shape<Double> triangle = new Triangle();
        System.out.println(triangle.square(10d, 5d));

        Shape<Double> square = new Square();
        System.out.println(square.square(4d));
    }
}
