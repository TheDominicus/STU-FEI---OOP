package sk.stuba.fei.uim.oop.entity;

public class Truck extends HeavyVehicle {

    private final int maxLoadWeight;

    public Truck(Person owner, String make, int height, int maxLoadWeight) {
        super(owner, make, height);
        this.maxLoadWeight = maxLoadWeight;
    }
    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }
    @Override
    public String toString() {
        return String.format("Vehicle: Truck, %s, Max load weight: %s",super.toString(),this.maxLoadWeight);
    }
}
