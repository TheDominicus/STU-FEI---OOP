/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author teacher
 */
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vozidlo v = new Vozidlo(1990,"Felicia",12425,1500);//vytvorenie instancie
        System.out.println("Typ = "+v.getTyp());
        System.out.println("Rok = "+v.getRokVyroby());
        System.out.println("Cena = "+v.getCena());
        System.out.println("Km = "+v.getKm());
        
        v.setTyp("Skoda Felicia");
        //v.setRokVyroby(1990);
        v.setCena(1000);
        v.setKm(142563);
        
        System.out.println("Typ = "+v.getTyp());
        System.out.println("Rok = "+v.getRokVyroby());
        System.out.println("Cena = "+v.getCena());
        System.out.println("Km = "+v.getKm());
        
        
        
        
        
    }
    
}
