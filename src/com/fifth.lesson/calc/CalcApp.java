package com.fifth.lesson.calc;

public class CalcApp {

    public static void main(String[] args){
        CalcApp calcApp = new CalcApp();
        System.out.println(calcApp.calculator.calculate(25, '/', 17));
        System.out.println(calcApp.calculator.calculate(25, '^', 17));
    }

    private static Calculator calculator = (value1, sign, value2) ->
            (sign == '+') ?  (value1 + value2) :
                    (sign == '*') ?  (value1 * value2) :
                            (sign == '/') ?  (value1 / value2) :
                                    (sign == '-') ?  (value1 - value2) :
                                            (sign == '√') ? (Math.pow(value1, 1 / value2)) :
                                                    (sign == '^') ? (Math.pow(value1, value2)) :
                                                            (sign == '@') ? (Math.pow((value1 + value2) / (value1 + 117), value2)) : 0;
}
