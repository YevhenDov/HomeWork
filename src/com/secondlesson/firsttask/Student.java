package com.secondlesson.Task1;

public class Student {
    private final String name;
    private final String surname;
    private final int course;
    private final int group;
    private final String specialty;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    private Student(
        final String name,
        final String surname,
        final int course,
        final int group,
        final String specialty)
    {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.specialty = specialty;
    }

    public static class StudentBuilder{
        private String name;
        private String surname;
        private int course;
        private int group;
        private String specialty;

        public StudentBuilder setName(final String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setSurname(final String surname){
            this.surname = surname;
            return this;
        }

        public StudentBuilder setCourse(final int course){
            this.course = course;
            return this;
        }

        public StudentBuilder setGroup(final int group){
            this.group = group;
            return this;
        }

        public StudentBuilder setSpecialty(final String specialty){
            this.specialty = specialty;
            return this;
        }

        public Student build(){
            return new Student(name, surname, course, group, specialty);
        }
    }
}
