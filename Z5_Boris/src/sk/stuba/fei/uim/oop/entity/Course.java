package sk.stuba.fei.uim.oop.entity;

public class Course {

    private String courseName;
    private int duration;
    private String teacher;
    private int capacity;
    private int registeredStudentsCount;
    private Student[] students;

    public Course(int capacity, String teacher, String courseName){
        this.capacity = capacity;
        this.teacher = teacher;
        this.courseName = courseName;
        this.registeredStudentsCount = 0;
        this.duration = 12;
        this.students = new Student[capacity];

    }
    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public int getDuration(){
        return this.duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getTeacher(){
        return this.teacher;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getRegisteredStudentsCount(){
        return this.registeredStudentsCount;
    }

    public void printRegisteredStudents(){

        for(int i = 0; i < this.registeredStudentsCount;i++){
            System.out.println(this.students[i].toString());
        }
    }

    public String toString(){
        return "Nazov kurzu: " + this.courseName + " Trvanie: " + this.duration + "Ucitel: " + this.teacher + "Volne miesta: " + (this.capacity-this.registeredStudentsCount);
    }

    public boolean registerStudent(Student student){

        if((this.capacity - this.registeredStudentsCount) > 0){

            this.students[this.registeredStudentsCount] = student;
            this.registeredStudentsCount++;

        } else{
            return false;
        }

        return true;
    }


}
