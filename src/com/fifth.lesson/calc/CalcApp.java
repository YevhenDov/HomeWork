package com.fifth.lesson.calc;


public class CalcApp {
    public static Calculator calculator = ((value1, sign, value2) ->
            (sign == '+') ?  (value1 + value2) :
                    (sign == '*') ?  (value1 * value2) :
                            (sign == '/') ?  (value1 / value2) :
                                    (sign == '-') ?  (value1 - value2) :
                                            (sign == '√') ? (Math.pow(value1, 1 / value2)) :
                                                    (sign == '^') ? (Math.pow(value1, value2)) :
                                                            (sign == '@') ? (Math.pow((value1 + value2) / (value1 + 117), value2)) :
                                                                    475);
}
