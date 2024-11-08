import java.awt.Color;
public class GameTestProgram {
    public static void main(String[] args) {
        Game  g;

        g = new Game();

        // Add some walls
        g.add(new Wall(new Point2D(0,0), 10, 200));
        g.add(new Wall(new Point2D(10,0), 170, 10));
        g.add(new Wall(new Point2D(180,0), 10, 200));
        g.add(new Wall(new Point2D(10,190), 170, 10));
        g.add(new Wall(new Point2D(80,60), 100, 10));
        g.add(new Wall(new Point2D(10,90), 40, 10));
        g.add(new Wall(new Point2D(100,100), 10, 50));

        // Add some prizes
        g.add(new Prize(new Point2D(165,25), 1000));
        g.add(new Prize(new Point2D(65,95), 500));
        g.add(new Prize(new Point2D(145,165), 750));

        // Add some traps
        g.add(new Trap(new Point2D(125,35)));
        g.add(new Trap(new Point2D(145, 145)));

        // Add some players
        g.add(new Player("Blue Person", Color.BLUE, new Point2D(38,156), 90));
        g.add(new Player("Yellow Person", Color.YELLOW, new Point2D(55,37), 270));
        g.add(new Player("Green Person", Color.GREEN, new Point2D(147,116), 0));

        // Add the ball
        //g.add(new Ball(new Point2D(90, 90)));

        System.out.println("Here are the Game Objects:");
        g.displayObjects();

        //Player player1 = new Player("hello", Color.PINK, new Point2D(100,100), 69);
        //g.add(player1);
        //player1.draw();

        Player player = new Player("Red Person", Color.RED, new Point2D(100,100),0);
        player.speed = 10;
        player.direction = 0;
        g.add(player);
        Ball ball = new Ball(new Point2D(100,100));
        ball.speed = 10;
        ball.direction = 0;
        g.add(ball);
        for (int i=0; i<20; i++)
            g.updateObjects();

        System.out.println("\nHere are the Harmful Objects:");
        Harmful[] dangerousStuff = g.harmfulObjects();
        for (Harmful d: dangerousStuff)
            System.out.println(" " + d);

        System.out.println("\nCurrent Danger Assessment:");
        System.out.println(g.assessDanger());
    }
}