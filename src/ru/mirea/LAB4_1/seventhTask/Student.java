package ru.mirea.LAB4_1.seventhTask;

public class Student extends Member{
    String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}
