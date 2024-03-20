package sk.stuba.fei.uim.oop.entity;

public class Student {
    public Student() {
    }

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "meno: " + this.name + " ID: " + this.id;
    }
    public void registerToCourse(Course course){
        boolean success = course.registerStudent(this);
    }
}
