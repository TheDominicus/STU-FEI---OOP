package hodina3;

/**
 *
 * @author Dominik
 */
public abstract class Postava {
    String Meno;
    int Energia;

    public Postava(String Meno, int Energia) {
        this.Meno = Meno;
        this.Energia = Energia;
    }
    
    final void KtoSi(){
        System.out.println("Meno postavy je "+Meno);
    }
    
    abstract void Boj();
    abstract void Pohyb();
}
