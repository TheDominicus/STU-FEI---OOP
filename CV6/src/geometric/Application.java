package geometric;

import java.awt.*;

public class Application {

    public static void main(String[] args) {

        Position p1 = new Position(10,20);
        //System.out.println(p1.toString());

        Circle c1 = new Circle(Color.RED,new Position(200,100),50);

        //System.out.println(c1.toString() + ", Area: " + c1.getArea());

        Circle c2 = new Circle(Color.YELLOW, new Position(10,20),150);

        //System.out.println(c2.toString() + ", Area: " + c2.getArea());

        Rectangle r1 = new Rectangle(Color.BLUE, new Position(200,300),200,50);

        Rectangle r2 = new Rectangle(Color.green, new Position(400,200),150,100);

//        System.out.println(r1.getCenter().toString());
//        System.out.println(r1.getWidth());
//
//        System.out.println(r1.toString());


        AbstractShape[] shapes = {r1,r2,c1,c2};

//        for(AbstractShape s: shapes){
//            System.out.println(s.toString() + ", area: " + s.getArea());
//
//            //Z podtriedy na nadtriedu mozem premenit len tak, z nadtriedy na podtriedu to uz nie je taka sranda(nie vzdy to ide):
//            if(s instanceof Rectangle){
//                Rectangle r = (Rectangle) s;
//                System.out.println(r.getWidth());
//                AbstractShape s2 = r;
//            }
//        }

        Svg.write("image.svg", shapes);

    }

}
