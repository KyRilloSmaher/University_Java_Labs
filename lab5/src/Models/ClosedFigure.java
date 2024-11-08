/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class ClosedFigure extends Figure {
    private float width ,heigth;
    private boolean isFilled;

    public ClosedFigure() {
    }

    public ClosedFigure(float width, float heigth, boolean isFilled) {
        this.width = width;
        this.heigth = heigth;
        this.isFilled = isFilled;
    }

    public ClosedFigure(float width, float heigth, boolean isFilled, Point2D line, String color) {
        super(line, color);
        this.width = width;
        this.heigth = heigth;
        this.isFilled = isFilled;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public float getHeigth() {
        return heigth;
    }

    public float getWidth() {
        return width;
    }

    public boolean isIsFilled() {
        return isFilled;
    }
    public float area(){return 0;}
    
    @Override
    public void display()
    {
        System.out.println("width : "+this.width);
        System.out.println("height : "+this.heigth);
        System.out.println("The Point2D : " + this.getLine().toString());
        System.out.println("color : "+this.getColor());
        System.out.println("filled : "+this.isIsFilled());
        System.out.println("area : "+this.area());
    }
    
}
