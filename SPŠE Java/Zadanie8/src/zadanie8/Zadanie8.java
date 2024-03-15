/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie8;

import java.util.Scanner;

/**
 *
 * @author Dominik Šuráni
 */
public class Zadanie8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadaj 2 vety a ja ich porovnám!");
        System.out.println("Zadaj 1. vetu:");
        String Veta1 = sc.nextLine();
        System.out.println("Zadaj 2. vetu:");
        String Veta2 = sc.nextLine();
        
        String Vysledok = Veta1.equals(Veta2) ? "Vety sú rovnaké" : "Vety nie sú rovnaké";
        
        System.out.println(Vysledok);
    }
    
}
