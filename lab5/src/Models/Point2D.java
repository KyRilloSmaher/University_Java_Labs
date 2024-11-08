/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class Point2D {
    
    private double x ,y ;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double [] arr){
        
         this.x= arr[0];
         this.y = arr[1];
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double[] getXY(){
         double [] xi = {x,y};
         return xi;
    }
    
    public double distance (double _x ,double _y){
        return Math.sqrt(Math.pow((_x-x), 2.0))+Math.pow((_y-y), 2.0);
    }
     public double distance (Point2D temp){
        return Math.sqrt(Math.pow((temp.x-x), 2.0))+Math.pow((temp.y-y), 2.0);
    }

    @Override
    public boolean equals(Object obj) {
        Point2D temp = (Point2D)obj;
         if (this ==temp)return true ;
         else if(this.x == temp.x && this.y == temp.y)return true;
        return false;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
