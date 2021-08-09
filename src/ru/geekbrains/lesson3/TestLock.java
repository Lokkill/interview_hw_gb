package ru.geekbrains.lesson3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    private static int value = 0;
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 30; i++){
            new Thread(() ->{
                try {
                    lock.lock();
                    System.out.println("Thread 1: value - " + value);
                    value++;
                }finally {
                    lock.unlock();
                }
            }).start();
        }
        for (int j = 0; j < 30; j++){
            new Thread(() ->{
                try {
                    lock.lock();
                    System.out.println("Thread 2: value - " + value);
                    value++;
                }finally {
                    lock.unlock();
                }
            }).start();
        }
    }
}
