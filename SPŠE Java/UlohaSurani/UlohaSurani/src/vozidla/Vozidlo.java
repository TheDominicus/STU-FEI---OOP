package vozidla;
public abstract class Vozidlo {
    protected String nazov;
    protected int rokVyroby;
    protected int KM;
    
    public Vozidlo(String nazov,int rokVyroby){
        this.KM = 0;
        this.nazov = nazov;
        this.rokVyroby = rokVyroby;
    }

    public int getKM() {
        return KM;
    }
    public String getNazov() {
        return nazov;
    }
    public int getRokVyroby() {
        return rokVyroby;
    }
    public void Jazda(int Km){
        if(Km<0) return;
        this.KM += Km;
    }
    public abstract void Info();
}
