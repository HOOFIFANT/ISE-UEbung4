
public class Robot
{
    private double positionX;
    private double positionY;
    
    public Robot()
    {
        this.positionX = 0;
        this.positionY = 0;
    }
    
    public double getX() {
        return this.positionX;
    }
    
    public double getY() {
        return this.positionY;
    }
    
    public void rolleNach(double x, double y) {
        this.positionX = x;
        this.positionY = y;
        return;
    }
}
