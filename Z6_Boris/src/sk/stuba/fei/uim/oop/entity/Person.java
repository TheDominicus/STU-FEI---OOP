package sk.stuba.fei.uim.oop.entity;

public class Person {

    public final String name;

    public final String adress;

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString(){
        return String.format("Meno: %s, Adresa: %s",this.name,this.adress);
    }
    
}
