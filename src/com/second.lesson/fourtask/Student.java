package com.second.lesson.fourtask;

public final class Student {

    private final int course;
    private final int group;
    private final String specialty;

    public Student(int course, int group, String specialty){
        this.course = course;
        this.group = group;
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public String getSpecialty() {
        return specialty;
    }
}
