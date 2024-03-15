/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie4;

import java.util.Scanner;

/**
 *
 * @author Dominik Šuráni
 */
public class Zadanie4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String H1, H2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadaj heslo:");
        H1 = sc.nextLine();
        H2 = sc.nextLine();
        System.out.println();
        
        if (H1.length() < 8) {
            System.out.println("Heslo je príliš krátke, zadaj znova!");
        } else {
            System.out.println("Heslo má dostatočnú dĺžku!");
        }
        
        if (H1.equals(H2)){
            System.out.println("Heslá sa zhodujú!");
        } else {
            System.out.println("Heslá sa nezhodujú!");
        }
        
        boolean MaleP = false;
        boolean VelkeP = false;
        boolean Cislica = false;
        boolean Ine = false;
        
        for (int i = 0; i < H1.length(); i++){
            
        }
    }
}