package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.entity.Course;
import sk.stuba.fei.uim.oop.entity.Student;
import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        String[] names = {
            "Július", "Eugen", "Vladislav",
            "Tamara", "Sabina", "Tomáš",
            "Matej", "Daniela", "Igor"
        };

        Course oop = new Course(7, "Julius Siska", "OOP");
        Course vsa = new Course(10, "Igor Kossaczky", "VSA");

        int min = 2_000;
        int max = 10_000;
        for (String name : names) {
            Student student = new Student();
            student.setName(name);
            student.setId(new Random().nextInt(min, max + 1));
            student.registerToCourse(oop);
            student.registerToCourse(vsa);
        }

        oop.printRegisteredStudents();
        vsa.printRegisteredStudents();
    }
}