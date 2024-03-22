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
public class Vozidlo {
    
    //vlastnosti - implicitne public
    private String znacka;
    private String farba;
    private double najazdeneKm;
    private double cena;
    private int rokVyroby;

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public double getNajazdeneKm() {
        return najazdeneKm;
    }

    public void setNajazdeneKm(double najazdeneKm) {
        this.najazdeneKm = najazdeneKm;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }
    
    
    
}
