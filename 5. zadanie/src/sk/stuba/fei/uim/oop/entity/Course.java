package sk.stuba.fei.uim.oop.entity;

import java.util.Arrays;

public class Course {
    private String courseName;
    private int duration;
    private String teacher;
    private int capacity;
    private int registeredStudentsCount;
    private Student[] students;

    public Course(int capacity, String teacher, String courseName) {
        this.capacity = capacity;
        this.teacher = teacher;
        this.courseName = courseName;
        this.registeredStudentsCount = 0;
        this.duration = 12;
        this.students = new Student[capacity];
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRegisteredStudentsCount() {
        return registeredStudentsCount;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printRegisteredStudents() {
        for (Student student : this.students) {
            System.out.println(student.toString());
        }
    }

    public boolean registerStudent(Student student) {
        if (registeredStudentsCount == capacity) {
            return false;
        }

        students[registeredStudentsCount] = student;
        registeredStudentsCount++;
        return true;
    }

    @Override
    public String toString() {
        return "názov: " + this.courseName
            + " trvanie: " + this.duration
            + " učiteľa: " + this.teacher
            + " voľné miesta: " + (this.capacity - this.registeredStudentsCount);
    }
}
