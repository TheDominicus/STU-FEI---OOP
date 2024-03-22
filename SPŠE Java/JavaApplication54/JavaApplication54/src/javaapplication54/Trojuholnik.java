/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication54;

/**
 *
 * @author Dominik
 */
public class Trojuholnik implements PlosnyObjekt, PlosnyObjektVypocty{
    private double stranaA;
    private double stranaB;
    private double stranaC;
    private double vyskaA;


    @Override
    public void kresli() {
        System.out.println("Kreslim trojuholnik");
    }

    @Override
    public void vyfarbi() {
        System.out.println("Vyfarbujem trojuholnik");
    }

    @Override
    public double obsah() {
        return (stranaA*vyskaA)/2;
    }

    @Override
    public double obvod() {
        return stranaA+stranaB+stranaC;
    }
    
}
