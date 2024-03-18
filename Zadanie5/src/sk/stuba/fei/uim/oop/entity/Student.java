package sk.stuba.fei.uim.oop.entity;

public class Student {
    public Student() { //konstruktor
    }

    private String name; //instancie
    private int id;

    public String getName() { //getter
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "meno: " + this.name + " ID: " + this.id;
    }
    public static void registerToCourse(Course course){
        registerStudent(course);
    }
}
