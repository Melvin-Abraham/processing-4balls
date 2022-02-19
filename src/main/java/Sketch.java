import processing.core.PApplet;

public class Sketch extends PApplet {
    public static PApplet sketch;

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 500;
    public static Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main(Sketch.class, args);
    }

    @Override
    public void setup() {
        // Let the current `PApplet` instance be used by other
        // class(es) to manipulate the sketch
        sketch = this;

        for (int i = 0; i < 4; i++) {
            int level = i + 1;
            balls[i] = new Ball(level);
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.draw();
            ball.update();
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    /**
     * [singleton] Returns a <code>PApplet</code> instance to be used by
     * other classes to manipulate the sketch.
     */
    public static PApplet getSketchInstance() {
        return sketch;
    }
}
