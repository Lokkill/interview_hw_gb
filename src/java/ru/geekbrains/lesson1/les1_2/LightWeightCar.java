package java.ru.geekbrains.lesson1.les1_2;

public class LightWeightCar extends Car implements Moveable {
    // todo: добавить модификатор доступа public
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
