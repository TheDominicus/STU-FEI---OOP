package geometric;


import java.awt.*;

public class Rectangle extends AbstractShape {
    private int width;

    private int height;

    public Rectangle(Color color,Position center, int width,int height){
        super(color,center);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return super.toString() + ", width: " + this.width + ", height: " + this.height;
    }
    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public String toSvg() {
        int x = getCenter().getX() - width/2;
        int y = getCenter().getY() - height/2;
        return String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"%s\" />",x,y,width,height,getColorAsSvg());
    }
}
