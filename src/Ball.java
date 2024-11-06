public class Ball extends MovableObject implements Harmful {

    private boolean 	isBeingHeld;

    public Ball(Point2D loc) {
        super(0, 0, loc);
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

    public void draw(){
        System.out.println("Ball is at " + getLocation() + " facing " + getDirection() + " degrees and moving at " + getSpeed() + " pixels per second." );
    }

    @Override
    public int getDamageAmount(){
        return -200;
    }

    @Override
    public void update() {
        if (getSpeed() > 0){

            switch (this.direction){
                case 0:
                    location.setX(location.getX() + getSpeed());
                    break;
                case 180:
                    location.setX(location.getX() - getSpeed());
                    break;
                case 90:
                    location.setY(location.getY() + getSpeed());
                    break;
                case 270:
                    location.setY(location.getY() - getSpeed());
                    break;
            }
            setSpeed(getSpeed() - 1);
        }

        this.draw();
    }
}