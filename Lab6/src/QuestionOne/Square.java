package QuestionOne;

public class Square extends Rectangle {
  public Square(){}
  public Square(String color , boolean filled, float side) {

    super(color ,filled ,side, side);
  }
  public float getSide() {
    return getWidth();
  }
  public void setSide(int side) {
    setWidth(side);
    setHeight(side);
  }
  @Override
  public float getArea() {
    return getWidth() * getHeight();
  }
  @Override
  public float getPerimeter() {
    return 4 * getWidth();
  }
  @Override
  public String toString() {
       return "Square [width=" + this.getSide() + ", height=" + getSide() + ", color=" + getcolor() + ", filled=" + isFilled() + "Area=" + getArea() + "Perimeter=" + getPerimeter()+"]";
  
}
}
