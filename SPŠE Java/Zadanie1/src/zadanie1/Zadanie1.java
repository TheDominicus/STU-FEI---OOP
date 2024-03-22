/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Dominik Šuráni
 */
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ahoj, som Zadanie1. Mám za úlohu zistiť, aký mobilný telefón máš?");
        String znacka = sc.nextLine();
        System.out.println("To je super, že máš "+znacka+". Ja mám Huawei");
        System.out.println("Koľko ročný máš ten "+znacka+"? Napíš to v rokoch prosím, ľahšie to pochopím!");
        int vek = sc.nextInt();
        sc.nextLine();
        if(vek > 0 && vek <= 1){
            System.out.println("Tak to máš nový telefón, to je fajn. Spokojný s ním?");
            char odpoved1 = sc.nextLine().charAt(0);
            if(odpoved1 == 'A' || odpoved1 == 'a'){
                System.out.println("Tak to je super.");
            }
            if(odpoved1 == 'N' || odpoved1 == 'n'){
                System.out.println("To ma mrzí, snáď si k nemu nájdeš cestu.");
            }
        }
        if(vek > 1 && vek <= 5){
            System.out.println("Priemerný telefónik, dúfam, že ešte vydrží");
        }
        if(vek > 5){
            System.out.println("Pomaly muzeiný kus, pekne zachovaný telefón");
        }
    }
}