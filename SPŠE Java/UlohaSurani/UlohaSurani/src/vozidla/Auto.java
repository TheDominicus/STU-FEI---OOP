package vozidla;
public class Auto extends Vozidlo {
    private String farba;
    private String typ;

    public Auto(String nazov, int rokVyroby, String farba,String typ){
        super(nazov, rokVyroby);
        this.farba = farba;
        this.typ = typ;
    }

    public String getFarba() {
        return farba;
    }
    public String getTyp() {
        return typ;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public void Info(){
        System.out.println("nazov "+this.nazov+" typ "+this.typ+" farrba "+this.farba);
    }
}
