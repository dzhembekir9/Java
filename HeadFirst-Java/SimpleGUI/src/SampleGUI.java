import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleGUI {
    JFrame frame;
    JButton labelChangingButton, colorChangingButton;
    JLabel label;
    String[] rndWords =
            {"car", "tree", "house", "button", "simple label", "not a human", "dog", "cat"};
    public static void main(String[] args) {
        SampleGUI s = new SampleGUI();
        s.go();
    }
    public void go () {
        MyDrawPanel d = new MyDrawPanel();
        frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        labelChangingButton = new JButton("Change Label");
        colorChangingButton = new JButton("Change Circle");
        label = new JLabel("I'm a label");

        labelChangingButton.addActionListener(new LabelListener());
        colorChangingButton.addActionListener(new ColorListener());

        frame.getContentPane().add(BorderLayout.EAST, labelChangingButton);
        frame.getContentPane().add(BorderLayout.SOUTH, colorChangingButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, d);

    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color rndColor = new Color(red, green, blue);
            g.fillOval(100, 180, 100, 100);
            g.setColor(rndColor);
        }
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int randomWordIndex = (int) (Math.random() * 8);
            label.setText("I'm a " + rndWords[randomWordIndex]);
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }
}
