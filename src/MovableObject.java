public abstract class MovableObject extends GameObject{

    protected int direction;
    protected int speed;

    public MovableObject (int d, int s, Point2D loc){
        super(loc);
        this.direction = d;
        this.speed = s;
    }

    public int getSpeed() { return speed; }
    public void setSpeed(int newSpeed) { speed = newSpeed; }
    public int getDirection() { return direction; }
    public void setDirection(int newDirection) { direction = newDirection; }

    public void update() {
        moveForward();
        draw();
    }

    public void moveForward() {
        if (speed > 0){
            location = location.add((int)
                    (Math.cos(Math.toRadians(direction)) * speed), (int)
                    (Math.sin(Math.toRadians(direction)) * speed));
        }}

    public abstract void draw();
}
