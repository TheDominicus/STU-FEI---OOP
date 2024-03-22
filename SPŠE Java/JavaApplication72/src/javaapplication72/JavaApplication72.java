/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

/**
 *
 * @author Ivan Polák
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vozidlo v1 = new Vozidlo(); //instancia
        
        v1.setZnacka("Skoda felicia");
        v1.setFarba("cervena");
        v1.setRokVyroby(1990);
        v1.setNajazdeneKm(100000);
        v1.setCena(1000);
        
        System.out.println("Znacka = " + v1.getZnacka());
        System.out.println("Farba = " + v1.getFarba());
        
        
        
    }
    
}
