import javax.swing.*;
import java.awt.*;


public class SettingsWindow extends JFrame {

    Controller controller;
    JButton back;

    SoundPanel soundPanel;
    MusicPanel musicPanel;
    GraphicsPanel graphicsPanel;


    public SettingsWindow(Controller controller){
        super("Settings");
        this.controller=controller;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(275, 350);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel settingsPanel = new JPanel();


        /**
         * Creates the sound, music, graphics, button, and title panel.
         */
        JLabel settingsLabel = new JLabel("Settings");
        soundPanel = new SoundPanel(controller);
        musicPanel = new MusicPanel(controller);
        graphicsPanel = new GraphicsPanel(controller);
        JPanel backButtonPanel = new JPanel();
        JPanel titlePanel = new JPanel();

        titlePanel.add(settingsLabel);

        /**
         * Sets the panels' alignment.
         */
        soundPanel.setAlignmentX(FlowLayout.RIGHT);
        musicPanel.setAlignmentX(FlowLayout.RIGHT);
        graphicsPanel.setAlignmentX(FlowLayout.RIGHT);
        backButtonPanel.setAlignmentX(FlowLayout.RIGHT);
        titlePanel.setAlignmentX(FlowLayout.RIGHT);

        /**
         * Sets the SettingsWindow distribution.
         */
        settingsPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        settingsPanel.add(titlePanel);
        settingsLabel.setAlignmentX(CENTER_ALIGNMENT);
        settingsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        settingsPanel.add(soundPanel);
        settingsPanel.add(musicPanel);
        settingsPanel.add(graphicsPanel);

        settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.Y_AXIS));
        add(settingsPanel);


        /**
         * Sets the back button.
         */
        back = new JButton("Back");
        backButtonPanel.add(back);
        settingsPanel.add(backButtonPanel);

        back.addActionListener(controller);
    }

    public GraphicsPanel getGraphicsPanel(){
        return graphicsPanel;
    }
    public SoundPanel getSoundPanel(){
        return soundPanel;
    }
    public MusicPanel getMusicPanel(){
        return musicPanel;
    }
}
