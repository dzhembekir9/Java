import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test {
    int index = 0;
    JFrame frame;
    DrawUpwards drawUpwards;
    JButton button;
    DrawStart drawStart;
    JLabel messageEnd, messageWelcome;
    public static void main(String[] args) {
        Test t = new Test();
        t.go();
    }
    public void go() {
        drawUpwards = new DrawUpwards();
        drawStart = new DrawStart();
        frame = new JFrame();
        messageEnd = new JLabel("");
        messageWelcome = new JLabel("Welcome to Tug'a Ball");
        messageEnd.setLocation(0, 0);

        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 3));
        button = new JButton();
        button.setText("Tug");
        button.addActionListener(new ButtonHandler());

        frame.add(messageWelcome);
        frame.add(button);
        frame.add(messageEnd);
        frame.add(drawStart);
        frame.add(drawUpwards);
        frame.add(drawStart);

          while (true) {
              frame.repaint();
              try {
                  Thread.sleep(50);
              } catch (Exception ex) {}

              if (index == 0) {
                  messageEnd.setText("You win!");
                  frame.setLayout(null);
                  break;
              }
          }
    }

    class DrawUpwards extends JPanel {
        public void paintComponent (Graphics g) {
            setSize(1000, 500);
            g.fillOval(index + 325, 100, 100, 100);
            index += 5;
        }
    }

    class DrawStart extends JPanel {
        public void paint(Graphics g) {
            g.drawLine(0, 0, 0, 300);
        }
    }


    class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            index -= 20;
            frame.repaint();
        }
    }
}
