package QuestionThree;

public class Circle extends GeometricObject{
  private float radius ;


public Circle() {
}

public Circle( String color ,boolean filled , float radius) {
    super(color, filled);
    setRadius(radius);
}
public Circle( float radius) {
   this.radius = radius ;
}

public float getRadius() {
    return radius;
}

public void setRadius(float radius) {
    this.radius = radius;
}
public float getArea(){
    return (float)(Math.PI * radius * radius);
}
public float getPerimeter(){
    return (float)(2 * Math.PI * radius);
}
@Override
public String toString() {
    return "Circle [Color=" + super.getcolor() + ", filled=" + super.isFilled() +"radius=" + this.getRadius() +", getArea()=" + this.getArea() + ", getPerimeter()=" + this.getPerimeter() +"]";
}
  
}
