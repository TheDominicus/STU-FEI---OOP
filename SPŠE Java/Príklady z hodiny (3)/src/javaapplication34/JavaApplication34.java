/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.ArrayList;

/**
 *
 * @author teacher
 */
public class JavaApplication34 {

    public static boolean addUnique(
            String hodnota, 
            ArrayList<String> z) {
        
        if(z.contains(hodnota)) {
            return false;
        } else {
            z.add(hodnota);
            return true;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> zoznam =
                new ArrayList<String>();
    
        System.out.println(addUnique("ahoj",zoznam));
        System.out.println(addUnique("ahoj",zoznam));
        System.out.println(addUnique("hello",zoznam));
        System.out.println(addUnique("ahoj",zoznam));
        System.out.println(addUnique("hi",zoznam));
        
        System.out.println(zoznam.toString());
        
    }
    
}
