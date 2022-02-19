import processing.core.PApplet;

public class Ball {
    public PApplet sketch = Sketch.getSketchInstance();

    public static final int CIRCLE_DIAMETER = 20;
    public float posX = 0;
    public final float posY;
    public int level;

    /**
     * @param level
     * The level of the ball starting from 1. This is used to
     * render the ball in the corresponding height. Usually, <code>index - 1</code>
     */
    public Ball(int level) {
        this.level = level;
        posY = sketch.height * (level / 5f);
    }

    /**
     * Renders the ball on the applet
     */
    public void draw() {
        sketch.ellipse(posX, posY, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
    }

    /**
     * Updates the horizontal position of the ball
     */
    public void update() {
        int incrementRate = this.level;
        posX += incrementRate;
    }
}
