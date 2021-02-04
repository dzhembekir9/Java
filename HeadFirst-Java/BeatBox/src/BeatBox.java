import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BeatBox extends JPanel {
    ArrayList<JCheckBox> checkboxList;
    JFrame frame;
    JPanel mainPanel;
    JButton start, stop, tempoUp, tempoDown, uncheckBoxes;

    Sequencer sequencer;
    Sequence sequence;
    Track track;

    String[] instrumentNames = { "Bass Drum", "ClosedHi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal",
            "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
            "Low-mid Tom", "High Agogo", "Open Hi Conga" };

    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

    public static void main(String[] args) {
        BeatBox b = new BeatBox();
        b.go();
    }
    public void go() {
        frame = new JFrame("Cyber BeatBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(1, 3));

        JPanel background = new JPanel(new BorderLayout());
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkboxList = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        tempoUp = new JButton("Tempo Up");
        tempoUp.addActionListener(new MyUpTempoListener());
        buttonBox.add(tempoUp);

        tempoDown = new JButton("Tempo Down");
        tempoDown.addActionListener(new MyDownTempoListener());
        buttonBox.add(tempoDown);

        uncheckBoxes = new JButton("Uncheck all boxes");
        uncheckBoxes.addActionListener(new uncheckBoxes());
        buttonBox.add(uncheckBoxes);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < instrumentNames.length; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);
        frame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16,16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();

        frame.setBounds(50,50,300,300);
        frame.pack();
        frame.setVisible(true);

    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    public void buildTrackAndStart() {
        int[] trackList = null;
        sequence.deleteTrack(track);
        track = sequence.createTrack();
        for (int i = 0; i < 16; i++) {
            trackList = new int[16];
            int key = instruments[i];
            for (int j = 0; j < 16; j++ ) {
                JCheckBox jc = checkboxList.get(j + 16*i);
                if ( jc.isSelected()) {
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            } // close inner loop
            makeTracks(trackList);
            track.add(makeEvent(176,1,127,0,16));
        } // close outer
        track.add(makeEvent(192,9,1,0,15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch(Exception e) {e.printStackTrace();}
    } // close buildTrackAndStart method

    public class MyStartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            buildTrackAndStart();
        }
    } // close inner class

    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            sequencer.stop();
        }
    } // close inner class
    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * 1.03));
        }
    } // close inner class
    public class MyDownTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * .97));
        }
    } // close inner class

    //not working
    public class uncheckBoxes implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    checkboxList.get(i).setSelected(false);
                }
            }
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < 16; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(144,9,key, 100, i));
                track.add(makeEvent(128,9,key, 100, i+1));
            }
        }
    }
    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch(Exception e) {e.printStackTrace(); }
        return event;
    }
} // close class

