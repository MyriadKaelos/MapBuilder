import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;

public class Board extends JPanel {
    public Board(int width, int height, int resolution) {
        this.width = width;
        this.height = height;
        this.resolution = resolution;
        this.lay = new Lay(width/resolution,height/resolution,resolution).lie;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawThing(g);
    }

    private void drawThing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for(int i = 0; i < height/resolution; i++) {
            for(int o = 0; o < width/resolution; o++) {
                if(lay[i][o]) {
                    g2d.setColor(new Color(new Random().nextFloat()/3,new Random().nextFloat()/5,new Random().nextFloat()/2));
                    g2d.fillRect(i*resolution,o*resolution,resolution,resolution);
                }
            }
        }
    }
    public int width;
    public int height;
    public int resolution;
    public boolean[][] lay;
}