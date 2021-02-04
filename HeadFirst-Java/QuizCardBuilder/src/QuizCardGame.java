import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class QuizCardGame {

    private JTextArea question, answer, setName;
    private ArrayList<QuizCard> cardList;
    private ArrayList<ArrayList<QuizCard>> setList;
    private JFrame frame, saveMenu;
    FileWriter writer;
    JButton saveButton;
    String setNameText = "default";

    public static void main(String[] args) {
        QuizCardGame builder = new QuizCardGame();
        builder.go();
    }

    public void go() {
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JButton nextButton = new JButton("Next Card");

        cardList = new ArrayList<>();
        setList = new ArrayList<>();
        JLabel qLabel = new JLabel("Question:");
        JLabel aLabel = new JLabel("Answer:");

        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);

        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        saveMenu = new JFrame("Save");
        saveMenu.setVisible(false);
        saveMenu.setSize(300, 400);


        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    // Next card
    private class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cardList.add(new QuizCard(question.getText(), answer.getText()));
            question.setText("");
            answer.setText("");
        }
    }

    // Save card
    private class SaveMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            saveMenu.setVisible(true);
            JPanel savePanel = new JPanel();
            JLabel saveLabel = new JLabel("Choose name for your set:");

            setName = new JTextArea(1, 20);
            saveButton = new JButton("Save set");
            saveButton.addActionListener(new SaveSetNameListener());

            savePanel.add(saveLabel);
            savePanel.add(setName);
            savePanel.add(saveButton);
            saveMenu.getContentPane().add(BorderLayout.CENTER, savePanel);

            setList.add(cardList);
            System.out.println(setList);
        }

    }

    // New set
    private class SaveSetNameListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                setNameText = setName.getText();
                writer = new FileWriter("Set.text");
                writer.write("Set name: " + setNameText + "\n");
                for (int i = 0; i < setList.size(); i++) {
                    for (int j = 0; j < cardList.size(); j++) {
                        writer.write(setList.get(i).get(j).getQuestion() + " - " +
                                setList.get(i).get(j).getAnswer() + "\n");
                    }
                }

                writer.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    private class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            question.setText("");
            answer.setText("");
            cardList.clear();
        }
    }

    private void safeFile() {
        try {
            setNameText = setName.getText();
            System.out.println(setNameText);
            writer = new FileWriter("Set.text");
            writer.write("Set name: " + setNameText + "\n");
            for (QuizCard card : cardList) {
                writer.write(card.getQuestion() + " - " + card.getAnswer() + "\n");
            }
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}

class QuizCardPlayer {

}

class QuizCard {
    private String question;
    private String answer;
    public QuizCard(String q, String a) {
        this.question = q;
        this.answer = a;
    }
    public String getQuestion() {
        return this.question;
    }
    public String getAnswer() {
        return this.answer;
    }
}