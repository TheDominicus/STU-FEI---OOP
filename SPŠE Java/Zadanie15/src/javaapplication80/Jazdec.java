package javaapplication80;

public class Jazdec extends Postava{
    String menoKona;

    public Jazdec(String meno, int energia, String menoKona){
        super(meno, energia);
        this.menoKona = menoKona;
    }


    @Override
    void boj() {
        System.out.println("najazd");
    }

    @Override
    void pohyb() {
        System.out.println("cval kona");
    }
    

}
