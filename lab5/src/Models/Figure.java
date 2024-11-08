/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class Figure {
    private Point2D line ;
    private String color;

    public Figure() {
    }

    public Figure(Point2D line, String color) {
        this.line = line;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLine(Point2D line) {
        this.line = line;
    }

    public String getColor() {
        return color;
    }

    public Point2D getLine() {
        return line;
    }
    
    public void display(){
        System.out.println("--------------------------------");
         System.out.println("Figure INFO : \n X coordinate is : " +this.line.getX() +"\n Y coordinate is :  "+ this.line.getY() + "\n Color is : "+this.color);
         System.out.println("--------------------------------");
    }
}
