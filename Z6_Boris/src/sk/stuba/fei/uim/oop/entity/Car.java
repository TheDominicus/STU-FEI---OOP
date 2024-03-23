package sk.stuba.fei.uim.oop.entity;

import java.awt.*;

public class Car extends LightVehicle {

    private Color color;

    public Car(Person owner, String make, int maxPassengerCapacity, Color color) {
        super(owner, make, maxPassengerCapacity);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Vehicle: Car, %s, Color: %s",super.toString(),this.color);
    }
}
