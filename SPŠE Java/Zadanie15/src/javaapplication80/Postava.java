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
public abstract class Postava {
    String meno;
    int energia;

    public Postava(String meno, int energia) {
        this.meno = meno;
        this.energia = energia;
    }
    
    
    
    final void ktoSi() {
        
        System.out.println("Ja som " + meno);
    
    }
    
    abstract void boj();
    abstract void pohyb();
}
