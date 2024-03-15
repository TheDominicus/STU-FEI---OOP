/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parnecisla_arraylist;

import java.util.ArrayList;

/**
 *
 * @author Dominik Šuráni
 */
public class ParneCisla_ArrayList {
    /**
     * @param args the command line arguments
     */
    public static String neparne(ArrayList <Integer> z) {
        for (int i=0; i<z.size(); i++) {
            if (z.get(i)%2==0) {
                z.remove(i);
            }
        }
        String neparne = z.toString();
        return neparne;
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> cisla = new ArrayList();
        cisla.add(2);
        cisla.add(1);
        cisla.add(32);
        cisla.add(13);
        cisla.add(69);
        cisla.add(420);
        System.out.println("Neparne cisla: "+neparne(cisla));
    }
}
