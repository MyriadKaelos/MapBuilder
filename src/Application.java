import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {

    public Application() {

        initUI();
    }

    private void initUI() {
        int width = 500;
        int height = 500;
        int resolution = 10;
        add(new Board(width,height,resolution));

        setSize(width, height);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}