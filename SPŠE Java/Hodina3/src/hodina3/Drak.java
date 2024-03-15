package hodina3;

/**
 *
 * @author Dominik
 */
public class Drak extends Postava{
    int PocetHlav;

    public Drak(int PocetHlav, String Meno, int Energia) {
        super(Meno, Energia);
        this.PocetHlav = PocetHlav;
    }

    @Override
    void Boj() {
        System.out.println("Oheň");
    }

    @Override
    void Pohyb() {
        System.out.println("Lieta");
    }
}
