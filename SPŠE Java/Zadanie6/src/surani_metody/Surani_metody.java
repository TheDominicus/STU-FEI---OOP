package surani_metody;

import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Surani_metody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte retazec: ");
        final String retazec = sc.nextLine();
        System.out.print("Zadajte znak: ");
        final char znak = sc.nextLine().charAt(0);
        sc.close();
        System.out.print(novaTrieda.spocitajZnak(retazec, znak));
    }
}