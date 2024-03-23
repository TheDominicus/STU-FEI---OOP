package sk.stuba.fei.uim.oop.entity;

public abstract class Vehicle {

    private Person owner;

    private final String make;

    public Vehicle(Person owner, String make){
        this.owner = owner;
        this.make = make;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString(){
        return String.format("Owner - %s, Maker: %s",owner.toString(),this.make);
    }
}
