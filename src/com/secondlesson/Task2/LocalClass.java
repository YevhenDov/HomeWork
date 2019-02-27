package com.secondlesson.Task2;

public class LocalClass {

    int x = 25;

    public void intOut(){
        class printInt{
            public void printInt(){
                System.out.println(x);
            }
        }

        printInt printInt = new printInt();
        printInt.printInt();
    }
}
