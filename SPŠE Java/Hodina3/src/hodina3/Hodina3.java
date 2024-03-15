package hodina3;

import java.util.ArrayList;

/**
 *
 * @author Dominik
 */
public class Hodina3 {
    public static void main(String[] args) {
        Drak D1 = new Drak(5,"Julius",100);
        
        ArrayList<Postava> Postavy = new ArrayList<Postava>();
        Postavy.add(D1);
        
        for(Postava P : Postavy){
            P.KtoSi();
            P.Boj();
        }
    }
}
