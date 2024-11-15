package QuestionTwo;

public class MovablePoint implements Movable {
    private float x;
    private float y;
    private float xAmount;
    private float yAmount;

    
    public MovablePoint(float x, float y, float xAmount, float yAmount) {
        this.x = x;
        this.y = y;
        this.xAmount = xAmount;
        this.yAmount = yAmount;
    }

    
    @Override
    public void moveRight() {
        x += xAmount;
    }

    @Override
    public void moveDown() {
        y += yAmount;
    }

    @Override
    public void moveLeft() {
        x -= xAmount;
    }

    @Override
    public void moveUp( ) {
        y -= yAmount;
    }

    @Override
    public String toString()
    {
        return "(" + x + " , " + y + ") Amount = (" + xAmount + " , " + yAmount + ")";
    }
}

