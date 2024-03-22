/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication54;

/**
 *
 * @author Dominik
 */
public class Obdlznik implements PlosnyObjekt, PlosnyObjektVypocty{
    private double stranaA;
    private double stranaB;

    @Override
    public void kresli() {
        System.out.println("Kreslim obdlznik");
    }

    @Override
    public void vyfarbi() {
        System.out.println("Vyfarbujem obdlznik");
    }

    @Override
    public double obsah() {
        return stranaA*stranaB;
    }

    @Override
    public double obvod() {
        return 2*stranaA+2*stranaB;
    }
    
}
