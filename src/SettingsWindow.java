import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by JoseRojas on 6/3/17.
 */
public class SettingsWindow extends JFrame {
    Controller controller;
    JButton back;

    public SettingsWindow(Controller controller){
        this.controller=controller;
        JPanel settingsPanel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);
        setResizable(false);


        JLabel settingsLabel = new JLabel("Settings");
        SoundPanel soundPanel = new SoundPanel();
        MusicPanel musicPanel = new MusicPanel();
        GraphicsPanel graphicsPanel = new GraphicsPanel();

        soundPanel.setLayout(new FlowLayout());
        soundPanel.setAlignmentX(FlowLayout.RIGHT);
        musicPanel.setLayout(new FlowLayout());
        musicPanel.setAlignmentX(FlowLayout.RIGHT);


        settingsPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        settingsPanel.add(settingsLabel);
        settingsLabel.setAlignmentX(CENTER_ALIGNMENT);
        settingsPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        settingsPanel.add(soundPanel);
        settingsPanel.add(musicPanel);
        settingsPanel.add(graphicsPanel);

        settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.Y_AXIS));
        add(settingsPanel);



        //back = new JButton("Back");
        //buttonPanel.add(back);

        //back.addActionListener(controller);
    }
}
