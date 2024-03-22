package vozidla;
public class Motorka extends Vozidlo {
    private int objemMotora;
    private String styl;

    public Motorka(String nazov, int rokVyroby, String styl, int objem){
        super(nazov, rokVyroby);
        this.objemMotora = objem;
        this.styl = styl;
    }
    public String getStyl() {
        return styl;
    }
    public int getObjemMotora() {
        return objemMotora;
    }

    public void Info(){
        System.out.println("nazov "+this.nazov+" styl "+this.styl+" objem "+this.objemMotora);
    }
}
