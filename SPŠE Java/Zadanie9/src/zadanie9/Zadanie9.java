/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie9;

import java.util.Scanner;

/**
 *
 * @author Dominik Šuráni
 */
public class Zadanie9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadaj 2 čísla a ja ich porovnám");
        System.out.println("Zadaj 1. číslo:");
        int Cislo1 = sc.nextInt();
        System.out.println("Zadaj 2. číslo:");
        int Cislo2 = sc.nextInt();
        
        //String Vysledok = Cislo1>Cislo2 ? "1. číslo je väčšie" : "2. číslo je väčšie";   
        int Vysledok = Cislo1>Cislo2 ? Cislo1 : Cislo2; 
        
        System.out.println("Väčšie číslo je "+Vysledok);
    }
    
}
