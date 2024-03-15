package listokdokina;
public class ListokDoKina {
    public static void main(String[] args) {
        //Zápis lístkov
        Listok L1 = new Listok("Jurský svet 3", "Kino Mier, Nové Zámky", 2.55, "17.1.2022", 7);
        Listok L2 = new Listok("John Wick 4", "Amfiteáter, Nové Zámky", 3.54, "30.3.2022", 6);
        Listok L3 = new Listok("Matrix 4", "Kino Mier, Nové Zámky", 1, "2.4.2022", 9);
        Listok L4 = new Listok("Avatar 2", "Amfiteáter, Nové Zámky", 4.79, "28.5.2022", 5);
        Listok L5 = new Listok("Čierny Panter 2", "Amfiteáter, Nové Zámky", 7.25, "24.7.2022", 8);
        
        //Výpis lístkov
        System.out.println("*Ponuka filmových lístkov*");
        System.out.println("**************************");
        System.out.println("Názov filmu: "+L1.getFilm());
        System.out.println("Miesto premiéry: "+L1.getMiestoPremiery());
        System.out.println("Cena lístku: "+L1.getCena()+"€");
        System.out.println("Dátum premiéry: "+L1.getDatum());
        System.out.println("Hodnotenie filmu: "+L1.getHodnotenie()+"/10");
        System.out.println("*************************");
        System.out.println("Názov filmu: "+L2.getFilm());
        System.out.println("Miesto premiéry: "+L2.getMiestoPremiery());
        System.out.println("Cena lístku: "+L2.getCena()+"€");
        System.out.println("Dátum premiéry: "+L2.getDatum());
        System.out.println("Hodnotenie filmu: "+L2.getHodnotenie()+"/10");
        System.out.println("*************************");
        System.out.println("Názov filmu: "+L3.getFilm());
        System.out.println("Miesto premiéry: "+L3.getMiestoPremiery());
        System.out.println("Cena lístku: "+L3.getCena()+"€");
        System.out.println("Dátum premiéry: "+L3.getDatum());
        System.out.println("Hodnotenie filmu: "+L3.getHodnotenie()+"/10");
        System.out.println("*************************");
        System.out.println("Názov filmu: "+L4.getFilm());
        System.out.println("Miesto premiéry: "+L4.getMiestoPremiery());
        System.out.println("Cena lístku: "+L4.getCena()+"€");
        System.out.println("Dátum premiéry: "+L4.getDatum());
        System.out.println("Hodnotenie filmu: "+L4.getHodnotenie()+"/10");
        System.out.println("*************************");
        System.out.println("Názov filmu: "+L5.getFilm());
        System.out.println("Miesto premiéry: "+L5.getMiestoPremiery());
        System.out.println("Cena lístku: "+L5.getCena()+"€");
        System.out.println("Dátum premiéry: "+L5.getDatum());
        System.out.println("Hodnotenie filmu: "+L5.getHodnotenie()+"/10");
    }
}
