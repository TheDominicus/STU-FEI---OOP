/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodina17122021;

/**
 *
 * @author Dominik
 */
public class Hodina17122021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vozidla V1 = new Vozidla();
        
        V1.setZnacka("Škoda Felicia");
        V1.setFarba("Červená");
        V1.setCena(25000);
        V1.setNajazdeneKm(100000);
        V1.setRokVyroby(1993);
        
        System.out.println("V1.Značka = "+V1.getZnacka());
        System.out.println("V1.Farba = "+V1.getFarba());
    }

}