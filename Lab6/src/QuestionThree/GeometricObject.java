package QuestionThree;

public abstract class GeometricObject implements Comparable<GeometricObject>{
   private String color ;
   private boolean filled;
public GeometricObject(){}
   public GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
}
public abstract float getArea();
public abstract float getPerimeter();
public String getcolor() {
    return color;
}
public void setcolor(String color) {
    this.color = color;
}
public boolean isFilled() {
    return filled;
}
public void setFilled(boolean filled) {
    this.filled = filled;
}
@Override
public String toString() {
    return "GeometricObject [Color=" + color + ", filled=" + filled + ", getArea()=" + getArea() + ", getPerimeter()="
            + getPerimeter() + "]";
}
@Override
public int compareTo(GeometricObject o) {
   
        return Float.compare(this.getArea(), o.getArea());
    
}

}
