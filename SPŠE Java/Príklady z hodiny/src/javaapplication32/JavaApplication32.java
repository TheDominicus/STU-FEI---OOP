/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author teacher
 */
public class JavaApplication32 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int R = 4;
        int S = 3;
        int[][] pole = new int[R][S];
        
        double sucet=0;
        for(int i=0;i<pole.length;i++) {//riadky
            for(int j=0;j<pole[i].length;j++) {//stlpce
                pole[i][j]=rand.nextInt(10);
                sucet = sucet + pole[i][j];
            }
        }
        System.out.println("Sucet = "+sucet);
        System.out.println("Priemer = "+sucet/(R*S));
        //pole[1][0]=99;
        //pole[2][2]=100;
        
        for(int i=0;i<pole.length;i++) {//riadky
            for(int j=0;j<pole[i].length;j++) {//stlpce
                System.out.print(pole[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    
    
    }
    
}
