/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vyrobky;

/**
 *
 * @author Dominik
 */
public class Vyrobok {
    private String NazovVyrobku;
    private int PocetKusov;
    private int CenaVyrobku;
    
    public String getNazovVyrobku(){
        return NazovVyrobku;
    }
    public void setNazovVyrobku(String NazovVyrobku){
        this.NazovVyrobku = NazovVyrobku;
    }
    
    public int getPocetKusov(){
        return PocetKusov;
    }
    public void setPocetKusov(int PocetKusov){
        this.PocetKusov = PocetKusov;
    }
    
    public float getCenaVyrobku(){
        return CenaVyrobku;
    }
    public void setCenaVyrobku(int CenaVyrobku){
        this.CenaVyrobku = CenaVyrobku;
    }
}

