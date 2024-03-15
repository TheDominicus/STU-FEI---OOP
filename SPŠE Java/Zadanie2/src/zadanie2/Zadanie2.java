/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Dominik Šuráni
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Ahoj, Zadaj 2 cisla, pri delení a odčítaní prosím zadaj ich v SPRÁVNOM PORADÍ!!!");
        float cislo1 = sc.nextFloat();
        float cislo2 = sc.nextFloat();
        System.out.println("Super, máme cisla "+cislo1+" a cislo "+cislo2);
        sc.nextLine();
        System.out.println("Akú operáciu chceš vykonať?");
        char operacia = sc.nextLine().charAt(0);
        if(operacia == 'S' || operacia == 's'){
            float vysledok = cislo1 + cislo2;
            System.out.println("Vysledok je "+vysledok);
        }
        if(operacia == 'O' || operacia == 'o'){
            float vysledok = cislo1 - cislo2;
            System.out.println("Vysledok je "+vysledok);
        }
        if(operacia == 'D' || operacia == 'd'){
            float vysledok = cislo1 / cislo2;
            System.out.println("Vysledok je "+vysledok);
        }
        if(operacia == 'N' || operacia == 'n'){
            float vysledok = cislo1 * cislo2;
            System.out.println("Vysledok je "+vysledok);
        }
        else{
            System.out.println("Nezadal si ani jednu možnosť! Začni znova!");
        }
    }
    
}