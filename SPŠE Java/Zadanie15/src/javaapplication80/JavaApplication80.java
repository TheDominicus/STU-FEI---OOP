/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

import java.util.ArrayList;

/**
 *
 * @author Ivan Polák
 */
public class JavaApplication80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Postava> postavy = new ArrayList<Postava>();
        postavy.add(new Drak(4,"jozko",150));
        postavy.add(new Jazdec("jozko",5 ,"sedak"));
        postavy.add(new Mag(30,"jozko" ,15));
        for(Postava p : postavy) {
            p.ktoSi();
            p.boj();
        }
    }
    
}
