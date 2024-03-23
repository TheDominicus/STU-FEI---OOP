package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.database.Database;
import sk.stuba.fei.uim.oop.entity.*;
import java.awt.Color;

public class Task6 {

    public static void main(String[] args) {

        Database database = new Database(10);

        database.register(new HeavyVehicle(new Person("Jozko","Bratislava"),"BMW",185));
        database.register(new Truck(new Person("Ferko","Brno"),"AVIA",285,2500));

        database.register(new LightVehicle(new Person("Vasek","Ceske Budejovice"),"Ferrari",2));
        database.register(new Car(new Person("Marek","Vysne Nemecke"),"Skoda",5, Color.RED));
        database.register(new Motorcycle(new Person("Valeriana","Zilina"),"Duccati",1,MotorcycleType.SPORT));

        //Ked pouzijem sout, Java sama zavola na ten objekt .toString()
        System.out.println(database);
    }

}
