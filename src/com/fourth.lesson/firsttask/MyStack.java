package com.fourth.lesson.firsttask;

import java.util.Stack;

public class MyStack<T> {
    private static final int DEFAULT_ARRAY_CAPACITY = 10;
    private Object[] stackArray;
    private int size;
    private int top;


    public MyStack(int top) {
        this.top = top;
        stackArray = new Object[top];
    }

    public void push(T t) {
        if (size >= stackArray.length) {
            System.out.println("Stack full");
        } else {
            stackArray[size++] = t;
        }
    }

    public void pop() {
        stackArray[top - 1] = null;
        top--;
    }

    public void clear() {
        for (int i = top; i >= 0; i--) {
            stackArray[i] = null;
        }
    }

    public int size() {
        return stackArray.length;
    }

    public T peek() {
        return (T) stackArray[top - 1];
    }

    public T remove(int index) {
        T temp = (T) stackArray[index];
        System.arraycopy(stackArray, index + 1, stackArray, index, size - index - 1);
        size--;
        return temp;
    }

    public void outArray() {
        for (int i = 0; i < stackArray.length; i++) {
            System.out.println(stackArray[i]);
        }
    }
}
