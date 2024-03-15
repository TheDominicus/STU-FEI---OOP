package javaapplication80;

public class Mag extends Postava{
    int levelMagie;

    public Mag(int sila,String meno,int energia){
        super(meno, energia);
        this.levelMagie = sila;
    }


    @Override
    void boj() {
        System.out.println("fire fireball");
    }

    @Override
    void pohyb() {
        System.out.println("kraca");
    }
    
}
