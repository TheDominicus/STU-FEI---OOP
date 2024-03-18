package sk.stuba.fei.uim.oop.entity;

public class Course {
    private String courseName; //instancie
    private int duration;
    private String teacher;
    private int capacity;
    private int registeredStudentsCount;

    public String getCourseName() { //getter
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

    public void setCourseName(String courseName) { //setter
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
}