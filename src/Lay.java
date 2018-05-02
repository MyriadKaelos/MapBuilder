import java.util.Random;

public class Lay {
    public Lay(int width, int height,int resolution) {
        this.height = height;
        this.width = width;
        this.up = height/2;
        this.left = width/2;
        this.lie = new boolean[height][width];
        for(int i = 0; i < height; i++) {
            for(int o = 0; o < width; o++ ) {
                lie[i][o] = false;
            }
        }
        for(int i = 0; i < 1000; i++) {
            move();
        }
    }
    public void move() {
        float f = new Random().nextFloat();
        float r = new Random().nextFloat();
        float k = width;
        float g = height;
        float t = up;
        float y = left;
        if(f > 0.5) {
            if(r > (t/g)) {
                up++;
            } else {
                up--;
            }
        } else {
            if(r > (y/k)) {
                left++;
            } else {
                left--;
            }
        }
        lie[up][left] = true;
    }
    public int width;
    public int height;
    public boolean[][] lie;
    public int up;
    public int left;
}