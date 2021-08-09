package ru.geekbrains.lesson3;

public class MyThreads {
    private final Object monitor = new Object();
    private volatile String value = "ping";

    public static void main(String[] args) {
        MyThreads myThreads = new MyThreads();
        Thread t1 = new Thread(myThreads::printPing);
        Thread t2 = new Thread(myThreads::printPong);
        t1.start();
        t2.start();
    }

    private void printPing(){
        synchronized (monitor){
            try {
                while (true){
                    while (!value.equals("ping")){
                        monitor.wait();
                    }
                    System.out.println(value);
                    value = "pong";
                    monitor.notify();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void printPong(){
        synchronized (monitor){
            try {
                while (true){
                    while (!value.equals("pong")){
                        monitor.wait();
                    }
                    System.out.println(value);
                    value = "ping";
                    monitor.notify();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
