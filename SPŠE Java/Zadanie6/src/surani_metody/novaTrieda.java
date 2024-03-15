package surani_metody;

/**
 *
 * @author Dominik
 */
public class novaTrieda {
    public static int spocitajZnak (String r, char c) {
        int p=0;
        for (int i=0; i<r.length(); i++) {
            if (r.charAt(i)==c) p++;
        }
        if (p<=0) { 
            System.out.println("Znak "+c+" sa nenachadza v retazci "+r);
            return 0;
        }
        else {
            System.out.println("Znak "+c+" sa nachadza v retazci "+r+" "+p+"-krat");
            return p;
        }
    }
}
