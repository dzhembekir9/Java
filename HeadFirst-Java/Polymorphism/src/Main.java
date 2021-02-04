import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Draw extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradientPaint = new GradientPaint(70 ,70, Color.red, 150, 150, Color.orange);
        g2d.setPaint(gradientPaint);
        g.fillOval(70, 70, 100, 100);

    }
}

class Display extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image img = new ImageIcon("ball.jpg").getImage();
        g.drawImage(img, 3, 4,this);
    }
}

public class Main extends JPanel implements ActionListener {

    JButton button, add, subtract;
    JTextField textField;
    JPanel panel;
    int clickCounter = 0;
    Draw d = new Draw();
    Display display = new Display();

    public static void main(String[] args) {

        Main m = new Main();
        m.go();

    }

    public void go() {

        panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setBounds(0, 0, 250, 250);

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(3, 3));
        ImageIcon image = new ImageIcon("ball.jpg");
        frame.setIconImage(image.getImage());

        button = new JButton("click me");
        button.setBounds(80,30,120,40);

        add = new JButton("+");
        add.setBounds(0, 0, 150, 50);

        subtract = new JButton("-");
        subtract.setBounds(150, 0, 150, 50);

        add.addActionListener(this);
        subtract.addActionListener(this);

        //frame.getContentPane().add(button);
        frame.add(add);
        frame.add(subtract);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.add(panel);
        textField = new JTextField("My name is Dzhem");
        textField.setBounds(0, 0, 200, 30);
        textField.setHorizontalAlignment(JTextField.CENTER);
        frame.add(textField);
        frame.setTitle("Cool");

        JLabel label = new JLabel("I am a label");
        ImageIcon img = new ImageIcon("ball.jpg");
        label.setIcon(img);
        frame.add(label);
        frame.add(d);
        frame.add(display);

    }

    public void actionPerformed(ActionEvent event) {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        if (event.getActionCommand().equals("+")) { clickCounter++; }
        if (event.getActionCommand().equals("-")) { clickCounter--; }
        panel.setBackground(randomColor);
        textField.setText("" + clickCounter);
    }


}