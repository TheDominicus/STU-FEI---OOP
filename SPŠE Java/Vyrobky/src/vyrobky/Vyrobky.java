package vyrobky;
/**
 *
 * @author Dominik
 */
public class Vyrobky {
    public static void main(String[] args) {
        Vyrobok v1 = new Vyrobok();
        Vyrobok v2 = new Vyrobok();
        Vyrobok v3 = new Vyrobok();
        Vyrobok v4 = new Vyrobok();
        Vyrobok v5 = new Vyrobok();
        
        v1.setNazovVyrobku("ASUS notebook");
        v1.setPocetKusov(3);
        v1.setCenaVyrobku(750);
        
        v2.setNazovVyrobku("Podlozka pod mys a klavesnicu");
        v2.setPocetKusov(5);
        v2.setCenaVyrobku(30);
        
        v3.setNazovVyrobku("RGB skrinka");
        v3.setPocetKusov(10);
        v3.setCenaVyrobku(250);
        
        v4.setNazovVyrobku("ASUS router");
        v4.setPocetKusov(35);
        v4.setCenaVyrobku(1500);
        
        v5.setNazovVyrobku("ASUS monitor");
        v5.setPocetKusov(2);
        v5.setCenaVyrobku(3000);
        
        System.out.println("*********Predaj počítačov a príslušenstva*********");
        System.out.println("**************************************************");
        System.out.println("Nazov vyrobku je " + v1.getNazovVyrobku());
        System.out.println("Počet kusov na sklade je " + v1.getPocetKusov());
        System.out.println("Cena jedneho výrobku je " + v1.getCenaVyrobku());
        System.out.println("**************************************************");
        System.out.println("Nazov vyrobku je " + v2.getNazovVyrobku());
        System.out.println("Počet kusov na sklade je " + v2.getPocetKusov());
        System.out.println("Cena jedneho výrobku je " + v2.getCenaVyrobku());
        System.out.println("**************************************************");
        System.out.println("Nazov vyrobku je " + v3.getNazovVyrobku());
        System.out.println("Počet kusov na sklade je " + v3.getPocetKusov());
        System.out.println("Cena jedneho výrobku je " + v3.getCenaVyrobku());
        System.out.println("**************************************************");
        System.out.println("Nazov vyrobku je " + v4.getNazovVyrobku());
        System.out.println("Počet kusov na sklade je " + v4.getPocetKusov());
        System.out.println("Cena jedneho výrobku je " + v4.getCenaVyrobku());
        System.out.println("**************************************************");
        System.out.println("Nazov vyrobku je " + v5.getNazovVyrobku());
        System.out.println("Počet kusov na sklade je " + v5.getPocetKusov());
        System.out.println("Cena jedneho výrobku je " + v5.getCenaVyrobku());
        System.out.println("**************************************************");
    }
}
