package com.fourth.lesson.firsttask;


public class MyArrayList<T> implements IMyList<T> {
    static final int DEFAULT_ARRAY_CAPACITY = 10;
    public Object[] dataArray;
    private int arraySize;
    private int index;

    public MyArrayList() {
        dataArray = new Object[DEFAULT_ARRAY_CAPACITY];
    }

    public MyArrayList(int arraySize) {
        dataArray = new Object[arraySize];
    }

    @Override
    public void add(T t) {
        if (index == dataArray.length) {
            growArray();
        }
        dataArray[index] = t;
        index++;
        arraySize++;
    }

    private void growArray() {
        Object[] tempArray = new Object[dataArray.length * 2];
        System.arraycopy(dataArray, 0, tempArray, 0, index - 1);
        dataArray = tempArray;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) dataArray[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException();
        }
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(dataArray, index + 1, dataArray, index, this.index - index);
        arraySize--;
        this.index--;
    }

    public int size() {
        return arraySize;
    }

    public void clear() {
        for (int i = 0; i < arraySize; i++) {
            dataArray[i] = null;
        }
    }
}
