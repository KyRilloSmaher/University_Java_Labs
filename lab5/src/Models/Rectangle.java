/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class Rectangle extends ClosedFigure {

    public Rectangle() {
    }
    public Rectangle(Point2D start, Point2D end, String color, boolean filled)
    {
 
        super(Math.abs((float)(start.getX() - end.getX())),Math.abs((float)(start.getY() - end.getY())),filled,start,color);
    }

    @Override
    public float area() {
        return super.getHeigth()*super.getWidth();
    }

    @Override
    public void display() {
     System.out.println("width : "+super.getWidth());
        System.out.println("height : "+this.getHeigth());
        System.out.println("The Point2D : " + this.getLine().toString());
        System.out.println("color : "+this.getColor());
        System.out.println("filled : "+this.isIsFilled());
        System.out.println("area : "+this.area());
    }
    
}
