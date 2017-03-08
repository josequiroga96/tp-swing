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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(275, 350);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel settingsPanel = new JPanel();



        JLabel settingsLabel = new JLabel("Settings");
        SoundPanel soundPanel = new SoundPanel(controller);
        MusicPanel musicPanel = new MusicPanel(controller);
        GraphicsPanel graphicsPanel = new GraphicsPanel(controller);
        JPanel buttonPanel = new JPanel();
        JPanel tittlePanel = new JPanel();

        tittlePanel.add(settingsLabel);


        soundPanel.setAlignmentX(FlowLayout.RIGHT);
        musicPanel.setAlignmentX(FlowLayout.RIGHT);
        graphicsPanel.setAlignmentX(FlowLayout.RIGHT);
        buttonPanel.setAlignmentX(FlowLayout.RIGHT);
        tittlePanel.setAlignmentX(FlowLayout.RIGHT);


        settingsPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        settingsPanel.add(tittlePanel);
        settingsLabel.setAlignmentX(CENTER_ALIGNMENT);
        settingsPanel.add(Box.createRigidArea(new Dimension(0, 50)));
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
}
