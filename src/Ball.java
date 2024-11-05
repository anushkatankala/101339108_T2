public class Ball extends GameObject {
    private int			direction;
    private int 		speed;
    private boolean 	isBeingHeld;

    public Ball(Point2D loc) {
        super(loc);
        direction = 0;
        speed = 0;
        isBeingHeld = false;
    }

    // The get/set methods
    public Point2D getLocation() { return location; }

    public boolean isBeingHeld() { return isBeingHeld; }

    public void setIsBeingHeld(boolean newHoldStatus) { isBeingHeld = newHoldStatus; }

    public String toString() {
        return "Ball" + " at (" + (int)location.getX() + "," + (int)location.getY() + ") facing " + direction +
                " degrees going " + speed + " pixels per second";
    }
}