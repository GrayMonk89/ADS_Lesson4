package ru.gb.ads_lesson4;

import java.util.Arrays;

public class MyDeque {

    private int[] array;
    private int size;
    private int head;
    private int tail;
    private int capacity;

    public MyDeque(int size) {
        this.size = size;
        array = new int[size];
        capacity = 0;
        head = 0;
        tail = -1;
    }

    public int getSize() {
        return size;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insertLeft(int i) {
        if (isFull()) throw new IndexOutOfBoundsException();
        if (--head < 0) {
            head = size - 1;
        }
        array[head] = i;
        capacity++;
    }

    public void removeLeft() {
        if (++head > size - 1)
            head = 0;
        capacity--;
        size--;
        int[] tempArray = new int[size];
        for(int i = 0; i < array.length-1; i++){
            tempArray[i] = array[i+1];
        }
        array = Arrays.copyOf(array, size);
        array = tempArray;
    }

    public void insertRight(int i) {
        if (isFull()) throw new IndexOutOfBoundsException();
        if (++tail > size) {
            tail = 0;
        }
        array[tail - 1] = i;
        capacity++;
        size++;
    }

    public void removeRight() {
        if (--tail < 0) tail = size - 1;
        capacity--;
        size--;
        array = Arrays.copyOf(array, size);
    }

    @Override
    public String toString() {
        return "Deque" + Arrays.toString(array);
    }
}
