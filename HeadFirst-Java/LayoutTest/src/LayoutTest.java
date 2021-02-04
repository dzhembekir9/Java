import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.jar.JarEntry;

public class LayoutTest {
    JFrame frame;
    JPanel panel, panelCenter;
    JButton button1, button2, button3, button4, button5, register;
    JLabel label, label2;
    JTextField textField, emailField, userData;
    JCheckBox checkBox;
    int counter = 0;
    String isChecked = "haven't checked";
    String checkText = "";

    public static void main(String[] args) {
        LayoutTest l = new LayoutTest();
        l.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        panel = new JPanel();
        panelCenter = new JPanel();
        panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
        checkBox = new JCheckBox("Check me");

        label = new JLabel("Name: ");
        textField = new JTextField("Enter your name");
        label2 = new JLabel("E-mail: ");
        emailField = new JTextField("Enter your email");
        register = new JButton("Register");
        userData = new JTextField("");

        textField.addActionListener(new textHandler());
        register.addActionListener(new buttonClickHandler());
        checkBox.addItemListener(new checkHandler());

        panelCenter.add(label);
        panelCenter.add(textField);
        panelCenter.add(label2);
        panelCenter.add(emailField);
        panelCenter.add(register);
        panelCenter.add(checkBox);

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Click me");
        button5 = new JButton("Click me");

        panel.setLayout(new GridLayout(1, 3));
        panel.setBackground(Color.DARK_GRAY);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.getContentPane().add(panelCenter);

    }

    class textHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            emailField.setText("");
        }
    }

    class checkHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (checkBox.isSelected()) {
                isChecked = "checked";
            }
            checkText = userData.getText() + ". You " + isChecked + " the checkbox.";
        }
    }

    class buttonClickHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (counter == 0) {
                userData.setText("Welcome " + textField.getText() + "! Your email is: " + emailField.getText() + checkText);
                panelCenter.add(userData);
                counter++;
            }
            textField.requestFocus();
        }
    }

}
