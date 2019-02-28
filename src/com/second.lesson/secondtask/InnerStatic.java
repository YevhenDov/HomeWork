package com.second.lesson.secondtask;

public class InnerStatic {
    public static class Factorial{

        private int result;
        private int value;

        public Factorial(int number, int x){

            result = number;
            value = x;

        }

        public int getResult(){
            return result;
        }

        public int getValue() {
            return value;
        }
    }

    public static Factorial getFactorial(int x){

        int result = 1;
        for (int i = 1; i <= x; i++){
            result *= i;
        }
        return new Factorial(result, x);
    }
}
