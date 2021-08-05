package ru.geekbrains.lesson2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArrayList<T> {
    private int size = 10;
    private final float MULT_CAPACITY = 1.5f;
    private Object[] arr;
    private int position = 0;

    public MyArrayList() {
        arr = new Object[size];
    }

    public MyArrayList(int capacity) {
        if (capacity != 0){
            arr = new Object[capacity];
            size = capacity;
        } else {
            arr = new Object[size];
        }
    }

    public void add(T element){
        if (position > size + 1){
            increaseSizeArr();
        }
        arr[position] = element;
        position++;
    }

    public void insert(int index, T element){
        if (validation(index)){
            arr[index] = element;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T get(int index){
        if (validation(index)) {
            return (T) arr[index];
        }
        return null;
    }

    public int indexOf(Object ob){
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(ob)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        if (validation(index)){
            Object[] arrPrev = Arrays.copyOfRange(arr, 0, index);
            Object[] arrNext = Arrays.copyOfRange(arr, index + 1, size - 1);
            Object[] resultArr = new Object[size - 1];
            System.arraycopy(arrPrev, 0, resultArr, 0, arrPrev.length);
            System.arraycopy(arrNext, 0, resultArr, arrPrev.length, arrNext.length);
            arr = resultArr;
        }
    }

    private void increaseSizeArr(){
        size = (int) (size * MULT_CAPACITY);
        arr = Arrays.copyOf(arr, size);
    }

    private boolean validation(int index){
        return index <= arr.length - 1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) ;
    }
}
