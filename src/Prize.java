public class Prize extends StationaryObject {
    private int 	    value;

    public Prize(Point2D loc, int val) {
        super(loc);
        value = val;
    }

    public String toString() {
        return "Prize" + " at (" + (int)location.getX() + "," + (int)location.getY() + ") with value " + value;
    }
}