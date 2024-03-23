package sk.stuba.fei.uim.oop.entity;

public class LightVehicle extends Vehicle {

    private final int MaxPassengerCapacity;

    public LightVehicle(Person owner, String make, int maxPassengerCapacity){
        super(owner,make);
        this.MaxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {
        return MaxPassengerCapacity;
    }
    @Override
    public String toString(){
        return String.format("Vehicle: Light vehicle, %s, Max passenger capacity: %s",super.toString(),this.MaxPassengerCapacity);
    }
}
