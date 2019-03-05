package com.fourth.lesson.firsttask;


public class MyArrayList<T> implements MyList<T> {
    static final int DEFAULT_ARRAY_CAPACITY = 10;
    private Object[] dataArray;
    private int arraySize;

    public MyArrayList() {
        dataArray = new Object[DEFAULT_ARRAY_CAPACITY];
    }

    public MyArrayList(int capacity) {
        dataArray = new Object[capacity];
    }

    @Override
    public void add(T t) {
        if (arraySize == dataArray.length) {
            growArray();
        }
        dataArray[arraySize] = t;
        arraySize++;
    }

    private void growArray() {
        Object[] tempArray = new Object[dataArray.length * 2];
        System.arraycopy(dataArray, 0, tempArray, 0, arraySize - 1);
        dataArray = tempArray;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) dataArray[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.arraySize) {
            throw new IllegalArgumentException();
        }
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(dataArray, index + 1, dataArray, index, arraySize - index);
        arraySize--;
    }

    public int size() {
        return arraySize;
    }

    public void clear() {
        for (int i = 0; i < arraySize; i++) {
            dataArray[i] = null;
        }
    }

    public Object[] getDataArray() {
        return dataArray;
    }
}
