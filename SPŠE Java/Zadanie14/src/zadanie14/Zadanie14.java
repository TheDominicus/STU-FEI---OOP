/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Zadanie14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cisla = new ArrayList<>();
        cisla.add(10);
        cisla.add(50);
        cisla.add(11);
        cisla.add(2);
        cisla.add(48);
        cisla.add(6);
        cisla.add(78);
        cisla.add(13);
        cisla.add(4);
        cisla.add(100);
        
        System.out.println("Zadaj cislo, od ktorého sa vymažú čísla v zozname:");
        int cislo = sc.nextInt();
        System.out.println();
        
        System.out.println("Zoznam čísel "+cisla);
        
        for(int i=0;cisla.size()<cislo; i++){
           cisla.remove(i);
        }
        System.out.println(cisla);
    }
}
