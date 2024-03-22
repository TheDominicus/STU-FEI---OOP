package geometric;

import java.awt.*;

public abstract class AbstractShape {

    private Color color;
    private Position center;

    public AbstractShape(Color color, Position center) {
        this.color = color;
        this.center = center;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getCenter() {
        return center;
    }

    public void setCenter(Position center) {
        this.center = center;
    }
    @Override
    public String toString(){
        return String.format("farba: %s, center: %s",color.toString(),center.toString());
    }

    public abstract double getArea();

    public abstract String toSvg();

    protected String getColorAsSvg(){
        return String.format("rgb(%d, %d, %d)",getColor().getRed(),getColor().getGreen(),getColor().getBlue());
    }

}
