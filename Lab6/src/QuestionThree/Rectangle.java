package QuestionThree;

public class Rectangle extends GeometricObject {
  private float width;
  private float height;
  public Rectangle(){

  }
  public Rectangle(String Color , boolean filled ,float width, float height) {
    super(Color,filled);
    this.width = width;
    this.height = height;
  }
 
  public float getWidth() {
    return width;
  }
  public void setWidth(float width) {
    this.width = width;
  }
  public float getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  public float getArea() {
    return width * height;
  }

public float  getPerimeter(){
    return 2 * (width + height);
  
}
  @Override
public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + ", color=" + getcolor() + ", filled=" + isFilled() + "Area=" + getArea() + "Perimeter=" + getPerimeter()+"]";
  }
}
