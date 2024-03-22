/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie12;

import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Zadanie12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] cisla = new int[20];
        for (int i=0; i<cisla.length; i++) {
            System.out.println("Zadajte cislo: ");
            cisla[i] = sc.nextInt();
        }
        int p0=0,p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0;
        for (int i=0; i<cisla.length; i++) {
            if (cisla[i]==0) p0++;
            else if (cisla[i]==1) p1++;
            else if (cisla[i]==2) p2++;
            else if (cisla[i]==3) p3++;
            else if (cisla[i]==4) p4++;
            else if (cisla[i]==5) p5++;
            else if (cisla[i]==6) p6++;
            else if (cisla[i]==7) p7++;
            else if (cisla[i]==8) p8++;
            else if (cisla[i]==9) p9++;
        }
        int [] vyskyty = {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
        for (int i=0; i<vyskyty.length; i++) {
            System.out.println("Cislo "+i+" bolo zadane "+vyskyty[i]+"x");
        }
        sc.close();
    }
    
}
