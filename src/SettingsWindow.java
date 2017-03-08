import javax.swing.*;
import java.awt.*;

/**
 * Created by JoseRojas on 6/3/17.
 */
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



        JLabel settingsLabel = new JLabel("Settings");
        soundPanel = new SoundPanel(controller);
        musicPanel = new MusicPanel(controller);
        graphicsPanel = new GraphicsPanel(controller);
        JPanel buttonPanel = new JPanel();
        JPanel titlePanel = new JPanel();

        titlePanel.add(settingsLabel);


        soundPanel.setAlignmentX(FlowLayout.RIGHT);
        musicPanel.setAlignmentX(FlowLayout.RIGHT);
        graphicsPanel.setAlignmentX(FlowLayout.RIGHT);
        buttonPanel.setAlignmentX(FlowLayout.RIGHT);
        titlePanel.setAlignmentX(FlowLayout.RIGHT);


        settingsPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        settingsPanel.add(titlePanel);
        settingsLabel.setAlignmentX(CENTER_ALIGNMENT);
        settingsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        settingsPanel.add(soundPanel);
        settingsPanel.add(musicPanel);
        settingsPanel.add(graphicsPanel);

        settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.Y_AXIS));
        add(settingsPanel);



        back = new JButton("Back");
        buttonPanel.add(back);
        settingsPanel.add(buttonPanel);

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
