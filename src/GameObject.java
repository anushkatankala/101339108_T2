import java.awt.*;

public abstract class GameObject {

    protected Point2D location;

    public GameObject (Point2D location) {
        this.location = location;
    }

    //get/set methods
    public Point2D getLocation() { return location; }
    public void setLocation(Point2D newLocation) { location = newLocation; }

    public abstract void update();

}
