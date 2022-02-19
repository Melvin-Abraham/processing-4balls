import processing.core.PApplet;

public class Sketch extends PApplet {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 500;
    public static final int CIRCLE_DIAMETER = 20;
    public int[] posX = {0, 0, 0, 0};

    public static void main(String[] args) {
        PApplet.main(Sketch.class, args);
    }

    @Override
    public void draw() {
        for (int i = 0; i < posX.length; i++) {
            drawCircle(i);
        }
    }

    private void drawCircle(int index) {
        float posY = HEIGHT * ((index + 1) / 5f);
        ellipse(posX[index], posY, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        incrementPosX(index);
    }

    private void incrementPosX(int index) {
        int incrementRate = index + 1;
        posX[index] += incrementRate;
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
}
