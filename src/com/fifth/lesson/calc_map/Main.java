package com.fifth.lesson.calc_map;

import static com.fifth.lesson.calc_map.CalcApp.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(calculate(15, ')', 52));
        } catch (Exception e) {
            System.out.println("Illegal sign");
        }
    }
}
