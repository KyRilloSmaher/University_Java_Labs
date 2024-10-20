package Models;

/**
 *
 * @author kyrillos
 */
public class Rectangle {
    private float Lenth;
    private float Width ;
    
    public Rectangle(){
        this.Lenth=0.0f;
        this.Width=0.0f;
    }
    
    public Rectangle(float l , float w){
        this.Lenth=l;
        this.Width=w;
    }
    
    // setters
    
    public void setLength(float l){
       this.Lenth = l>=0.0 ? l: 0.0f;
    }
    public void setWidth(float w){
       this.Width = w>=0.0 ? w: 0.0f;
    }

   // getters
    
    public float getLength(){
        return this.Lenth;
    }
    
    public float getWidth(){
        return this.Width;
    }

public float getArea(){
    return this.Lenth*this.Width;
}
 
public float getPerimeter(){
    return 2*(this.Lenth+this.Width);
}
    
    @Override
    public String toString(){
        return "\n---------Rectangle Data---------\n Width = "+this.Width+"\nLength = "+this.Lenth+"\n Rectangle Area is "+this.getArea()+"\n Rectangle Perimeter is "+this.getPerimeter()+"\n-----------------------------------\n";
    }
}
