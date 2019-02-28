package com.secondlesson.Task1;

public class Main {
    public static void main(String[] args){
        final Student firstStudent = new Student.StudentBuilder()
                .setName("Ann")
                .setSurname("Petrova")
                .setCourse(2)
                .setGroup(457167)
                .setSpecialty("math")
                .build();
    }
}
