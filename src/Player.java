import java.awt.Color;
public class Player extends GameObject{
    private int			direction;
    private int 		speed;
    private String		name;
    private Color       color;
    private boolean 	hasBall;
    private int	 		score;



    public Player(String n, Color c, Point2D loc, int dir) {
        super(loc);
        direction = dir;
        speed = 0;
        name = n;
        color = c;
        hasBall = false;
        score = 0;
    }

    // The get/set methods
    public String getName() { return name; }
    public Color getColor() { return color; }
    public boolean hasBall() { return hasBall; }
    public int getScore() { return score; }
    public void setHasBall(boolean newHasBall) { hasBall = newHasBall; }
    public void setScore(int newScore) { score = newScore; }

    public String toString() {
        String  s =  "Player" + " " + name + " at (" + (int)location.getX() + "," + (int)location.getY() + ") facing " + direction + " degrees";
        if (hasBall)
            s += " with the ball";
        return s;
    }
}