package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.entity.Course;
import sk.stuba.fei.uim.oop.entity.Student;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        String[] names = {"Július", "Eugen", "Vladislav", "Tamara", "Sabina", "Tomáš", "Matej", "Daniela", "Igor"};

        Course oop = new Course(7,"Julius Siska","OOP");

        Course vsa = new Course(10, "Igor Kossaczky", "VSA");

        Random rand = new Random(System.currentTimeMillis());

        int num;

        for (int i = 0; i < 9; i++){

            Student student = new Student();

            student.setName(names[i]);

            num = rand.nextInt(2000,10000);

            student.setId(num);

            student.registerToCourse(oop);

            student.registerToCourse(vsa);
        }

        oop.printRegisteredStudents();

        System.out.println("-----------------------------");

        vsa.printRegisteredStudents();

    }

}
