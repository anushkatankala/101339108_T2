public class Trap extends StationaryObject {

    public Trap(Point2D loc) {
        super(loc);
    }

    // The get method

    public String toString() {
        return "Trap" + " at (" + (int)location.getX() + "," + (int)location.getY() + ")";
    }
}