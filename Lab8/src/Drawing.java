/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kyrillos
 */

import java.awt.Color;
import java.awt.Point;

public class Drawing 
{
    Color color;
    String type;
    Point start, end;  
    boolean filled;

    public Drawing(Color c, String type, Point start, Point end, boolean filled) 
    {
        this.color = c;
        this.type = type;
        this.start = start;
        this.end = end;
        this.filled = filled;
    }

    public void setColor(Color c) 
    {
        this.color = c;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setStart(Point start)
    {
        this.start = start;
    }

    public void setEnd(Point end) 
    {
        this.end = end;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Color getColor() 
    {
        return color;
    }

    public String getType() 
    {
        return type;
    }

    public Point getStart()
    {
        return start;
    }

    public Point getEnd() 
    {
        return end;
    }

    public boolean isFilled()
    {
        return filled;
    }
    
    
    
}

