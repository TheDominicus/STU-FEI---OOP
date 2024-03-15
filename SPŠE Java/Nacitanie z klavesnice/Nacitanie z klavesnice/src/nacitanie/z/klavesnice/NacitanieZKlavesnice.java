/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacitanie.z.klavesnice;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Dominik Šuráni
 */
public class NacitanieZKlavesnice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ahoj, Ako sa volas?");
        String meno;
        meno = sc.nextLine();
        System.out.println("Ahoj, " +meno+ "!");
        
        System.out.println("Kolko mas rokov?");
        int vek;
        vek = sc.nextInt();
        if(vek>=0 && vek <= 100){
            System.out.println(meno+", ty si ale mlady, len "+vek+" rokov!");
        }else{
            System.out.println(meno+", preco mi davas nezmyselne cisla?!");
            System.out.println(meno+"Odchadzam, AHOJ!!");
        }
        
        /* 
        sc.nextLine(); //Vyčistenie bufferu
        
        System.out.println("Pohlavie? M/Z");
        char pohlavie;
        pohlavie = sc.nextLine().charAt(0);
        if(pohlavie == 'M'){
            System.out.println("Pan "+meno);
        }
        if(pohlavie == 'Z'){
            System.out.println("Slecna "+meno);
        }
        
        System.out.println("Kolko kg a vysku mas?");
        float vaha;
        vaha = sc.nextFloat();
        float vyska;
        vyska = sc.nextFloat();
        float bmi = vaha / (vyska*vyska);
        System.out.println("BMI: "+bmi);
        
        if(bmi<18.5){
            System.out.println("Podviziva");
        }
        if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        if(bmi>24.9){
            System.out.println("Nadvaha");
        }
        
        System.out.println(Math.E);
        System.out.println(Math.PI);
        
        System.out.println("Zadaj uhol na vypocet:");
        double uhol = sc.nextDouble();
        double radian = uhol*Math.PI/180;
        System.out.println("Sin = "+Math.sin(radian));
        
        System.out.println(Math.sqrt(16.0));
        System.out.println(Math.pow(2, 10));
        
        float x,y;
        System.out.println("Zadaj desatinne cislo: ");
        x = sc.nextFloat();
        System.out.println("Zadaj pocet desatinnych miest");
        y = sc.nextFloat();
        double vysledok = x*Math.pow(10,y);
        vysledok = Math.round(vysledok);
        vysledok = vysledok/Math.pow(10, y);
        System.out.println(vysledok);
        
        double a,b;
        System.out.println("Zadaj OD");
        a = sc.nextDouble();
        System.out.println("Zadaj DO");
        b = sc.nextDouble();*/
        
        
        //DU -> Vypis informaci (mobil)
        //DU -> Jednoducha kalkulacka
    }
}
