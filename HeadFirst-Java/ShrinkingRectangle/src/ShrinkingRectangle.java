import javax.swing.*;
import java.awt.*;

public class ShrinkingRectangle {
    JFrame frame;
    int width = 200;
    int height = 100;
    public static void main(String[] args) {
        ShrinkingRectangle s = new ShrinkingRectangle();
        s.go();
    }
    public void go() {
        DrawRectangle d = new DrawRectangle();
        frame = new JFrame("Shrinking rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.add(d);
        while (height > 0) {
            frame.repaint();
            width -= 2;
            height--;
            try {
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }
    class DrawRectangle extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(150, 150, width, height);
        }
    }

}
