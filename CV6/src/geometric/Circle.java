package geometric;

import java.awt.Color;
public class Circle extends AbstractShape {

    private int radius;

    public Circle(Color color, Position center, int radius){
        super(color,center);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return String.format("%s, radius: %d",super.toString(),radius);
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
