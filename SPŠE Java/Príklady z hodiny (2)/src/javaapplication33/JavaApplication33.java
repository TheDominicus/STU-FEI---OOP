/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author teacher
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> zoznam = 
                new ArrayList<Integer>();
        
        System.out.println(zoznam.size());
        //!pridavanie prvkokv
        zoznam.add(10);
        zoznam.add(20);
        zoznam.add(30);
        zoznam.add(40);
        zoznam.add(30);
        zoznam.add(30);
        zoznam.add(1,11);
        //!vypis zoznamu na onrazovku
        /*for(int i=0;i<zoznam.size();i++) {
            System.out.print(zoznam.get(i)+" ");
        }*/
        //! cyklus for each
        /*for(Integer prvok : zoznam) {
            System.out.print(prvok+" ");
        }*/
        System.out.print(zoznam.toString());
        
        Integer cislo=30;
        /*cislo = sc.nextInt();
        
        if(zoznam.contains(cislo)) {
            System.out.println("Nachadza sa v zozname");
        } else {
            System.out.println("Nenachadza sa v zozname");
        }*/
        
        System.out.println((zoznam.indexOf(cislo)));
        System.out.println((zoznam.lastIndexOf(cislo)));
        
        Collections.sort(zoznam);
        
        System.out.println(zoznam.toString());
        
        
    }
    
}
