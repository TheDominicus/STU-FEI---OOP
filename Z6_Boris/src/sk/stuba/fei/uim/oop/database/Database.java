package sk.stuba.fei.uim.oop.database;

import sk.stuba.fei.uim.oop.entity.*;

public class Database {

    private Vehicle[] registeredVehicles;

    private int registeredVehiclesCount;

    public Database(int capacity){
        this.registeredVehicles = new Vehicle[capacity];
        this.registeredVehiclesCount = 0;
    }

    public int getRegisteredVehiclesCount() {
        return registeredVehiclesCount;
    }

    public boolean register(Vehicle vehicle){

        if (registeredVehiclesCount < registeredVehicles.length){

            registeredVehicles[registeredVehiclesCount] = vehicle;
            registeredVehiclesCount++;

        } else {

            return false;
        }
        return true;
    }
    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();

        for (int i = 0; i<registeredVehiclesCount; i++){
            res.append(registeredVehicles[i].toString() + "\n");
        }
        return res.toString();
    }
}
