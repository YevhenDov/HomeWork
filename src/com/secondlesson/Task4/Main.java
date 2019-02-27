package com.secondlesson.Task4;

public class Main {
    public static void main(String [] args){
        Student student = new Student(4, 341514, "Chemistry");
        System.out.println(student.getCourse());
        System.out.println(student.getGroup());
        System.out.println(student.getSpecialty());
    }
}
