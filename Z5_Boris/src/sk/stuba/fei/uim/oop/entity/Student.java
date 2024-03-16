package sk.stuba.fei.uim.oop.entity;

public class Student {

    private String name;
    private int id;

    public Student(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "Meno: " + this.name + " ID: " + this.id;
    }

    public void registerToCourse(Course course){
        boolean success = course.registerStudent(this);

        if (success){
            System.out.println("Registracia sa podarila !");

        } else{
            System.out.println("Registracia zlyhala :( ");
        }
    }


}
