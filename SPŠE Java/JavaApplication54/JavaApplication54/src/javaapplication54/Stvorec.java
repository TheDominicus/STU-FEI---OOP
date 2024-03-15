/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author teacher
 */
public class Stvorec implements PlosnyObjekt, PlosnyObjektVypocty{
    private double stranaA;
    
    @Override
    public void kresli() {
        System.out.println("Kreslim stvorec");
    }

    @Override
    public void vyfarbi() {
        System.out.println("Vyfarbujem stvorec");
    }

    @Override
    public double obsah() {
        return stranaA*stranaA;
    }

    @Override
    public double obvod() {
        return 4*stranaA;
    }
    
}
