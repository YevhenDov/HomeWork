package com.second.lesson.secondtask;

public class Local {

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
