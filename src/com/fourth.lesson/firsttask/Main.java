package com.fourth.lesson.firsttask;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        MyLinkedList<String> str = new MyLinkedList<>();
        LinkedList<String> str1 = new LinkedList<>();

        str.add("Str1");
        str.add("Str2");
        str.add("Str3");
        str.add("Str4");
        str.add("Str5");

        System.out.println(str.size());
        System.out.println(str.get(3));
        str.remove(3);
        System.out.println(str.get(3));
        str.clear();
        System.out.println(str.size());
    }
}
