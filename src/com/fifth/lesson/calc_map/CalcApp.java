package com.fifth.lesson.calc_map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class CalcApp {
    private static Map<Character, DoubleBinaryOperator> sign;

    static {
        sign = new HashMap<>();
        sign.put('+', (value1, value2) -> value1 + value2);
        sign.put('*', (value1, value2) -> value1 * value2);
        sign.put('/', (value1, value2) -> value1 / value2);
        sign.put('-', (value1, value2) -> value1 - value2);
        sign.put('√', (value1, value2) -> Math.pow(value1, 1 / value2));
        sign.put('^', (value1, value2) -> Math.pow(value1, value2));
        sign.put('@', (value1, value2) -> Math.pow((value1 + value2) / (value1 + 117), value2));
    }


    public static double calculate(double value1, char sign2, double value2) {
        return sign.getOrDefault(sign2, sign.get('n')).applyAsDouble(value1, value2);
    }
}
