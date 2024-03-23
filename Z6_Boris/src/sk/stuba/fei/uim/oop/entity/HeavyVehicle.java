package sk.stuba.fei.uim.oop.entity;

public class HeavyVehicle extends Vehicle {

    private int height;

    public HeavyVehicle(Person owner, String make, int height) {
        super(owner, make);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Vehicle: Heavy vehicle, %s, height: %s",super.toString(), this.height);
    }
}
