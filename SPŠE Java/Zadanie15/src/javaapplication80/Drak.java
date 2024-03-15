/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

/**
 *
 * @author Ivan Polák
 */
public class Drak extends Postava{
    int pocetHlav;

    public Drak(int pocetHlav, String meno, int energia) {
        super(meno, energia);
        this.pocetHlav = pocetHlav;
    }
    
    

    @Override
    void boj() {
        System.out.println("Ohen");
    }

    @Override
    void pohyb() {
        System.out.println("lieta");
    }
    
}
