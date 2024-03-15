import java.util.ArrayList;

import vozidla.Vozidlo;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vozidlo> vozidla = new ArrayList<Vozidlo>();
        vozidla.add(new vozidla.Motorka("skuter", 2016, "mestky", 100));
        vozidla.add(new vozidla.Motorka("skuter", 2016, "mestky", 100));
        vozidla.add(new vozidla.Auto("kia", 2010,"cervena", "SUV"));
        vozidla.add(new vozidla.Auto("skoda", 2004,"zelena", "Combi"));
        for(Vozidlo x : vozidla){
            x.Info();
        }

    }
}
