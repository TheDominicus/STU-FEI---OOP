/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author teacher
 */
public class Vozidlo {
    private int rokVyroby;
    private String typ;
    private double km;
    private double cena;

    public Vozidlo(int rokVyroby, String typ, double km, double cena) {
        this.rokVyroby = rokVyroby;
        this.typ = typ;
        this.km = km;
        this.cena = cena;
    }

    public Vozidlo(int rokVyroby, String typ, double km) {
        this.rokVyroby = rokVyroby;
        this.typ = typ;
        this.km = km;
        this.cena = 0;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
