/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hodina4;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Dominik Šuráni
 */
public class Hodina4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> databaza = new ArrayList<Student>;
        
        Student s1 = new Student("Alena", "3.AI", 17);
        Student s2 = new Student("Dominik", "4.AI", 18);
        Student s3 = new Student("Pavol", "1.AI", 15);
        Student s4 = new Student("Emma", "2.AI", 16);
        Student s5 = new Student("Jozef", "4.AI", 19);
        
        databaza.add(s1);
        databaza.add(s2);
        databaza.add(s3);
        databaza.add(s4);
        databaza.add(s5);
        
        Collection.sort(databaza, new ComparatorByName);
        
        for(Student o : databaza){
            System.out.println(o.getMeno());
            System.out.println(o.getTrieda());
            System.out.println(o.getVek());
        }
    }
    
}
