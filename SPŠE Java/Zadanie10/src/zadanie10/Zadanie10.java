/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie10;

import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Zadanie10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadaj vetu a písmeno na vymazanie");
        System.out.println("Zadaj vetu:");
        String Veta = sc.nextLine();
        System.out.println("Zadaj písmeno:");
        String Pismeno = sc.nextLine();

        String NovaVeta = Veta.replace(Pismeno, "*");
        System.out.println(NovaVeta);
}