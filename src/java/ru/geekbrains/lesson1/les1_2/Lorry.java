package java.ru.geekbrains.lesson1.les1_2;

public class Lorry extends Car, Moveable, Stopable {
    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }

}
