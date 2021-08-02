package java.ru.geekbrains.lesson1.les1_2;

// Todo: Необходимо использовать implements для интерфесов
// public class Lorry extends Car implements Moveable, Stopable {
public class Lorry extends Car, Moveable, Stopable {
    // Todo: Лучше явно указывать, что это перегрузка метода посреством аннотации @Override
    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
    // Todo: Не реализован метод open() (реализация объязательна)
    @Override
    void open() {

    }
}
