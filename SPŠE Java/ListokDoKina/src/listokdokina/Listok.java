package listokdokina;
public class Listok {
    private String Film;
    private double Cena;
    private String Datum;
    private int Hodnotenie;
    private String MiestoPremiery;

    public Listok(String Film, String MiestoPremiery, double Cena, String Datum, int Hodnotenie) {
        this.Film = Film;
        this.MiestoPremiery = MiestoPremiery;
        this.Cena = Cena;
        this.Datum = Datum;
        this.Hodnotenie = Hodnotenie;
    }
    
    public Listok(String Film, String MiestoPremiery, double Cena, String Datum) {
        this.Film = Film;
        this.MiestoPremiery = MiestoPremiery;
        this.Cena = Cena;
        this.Datum = Datum;
        this.Hodnotenie = 0;
    }

    public String getMiestoPremiery() {
        return MiestoPremiery;
    }

    public String getFilm() {
        return Film;
    }

    public double getCena() {
        return Cena;
    }

    public String getDatum() {
        return Datum;
    }

    public int getHodnotenie() {
        return Hodnotenie;
    }

    public void setMiestoPremiery(String MiestoPremiery) {
        this.MiestoPremiery = MiestoPremiery;
    }

    public void setFilm(String Film) {
        this.Film = Film;
    }

    public void setCena(double Cena) {
        this.Cena = Cena;
    }

    public void setDatum(String Datum) {
        this.Datum = Datum;
    }

    public void setHodnotenie(int Hodnotenie) {
        this.Hodnotenie = Hodnotenie;
    }
}
