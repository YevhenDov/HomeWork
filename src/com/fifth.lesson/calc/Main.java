package com.fifth.lesson.calc;

public class Main {
    public static void main(String[] args){
        CalcApp calcApp = new CalcApp();
        System.out.println(calcApp.calculator.calculate(25, '/', 17));
        System.out.println(calcApp.calculator.calculate(25, '^', 17));
    }
}
