import javax.swing.*;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class SoundPanel extends JPanel{

    public SoundPanel() {

        JRadioButton soundOn = new JRadioButton("On");
        JRadioButton soundOff = new JRadioButton("Off");
        JLabel soundLabel = new JLabel("Sound:");

        add(soundLabel);
        add(soundOn);
        add(soundOff);

        ButtonGroup soundGroup = new ButtonGroup();
        soundGroup.add(soundOn);
        soundGroup.add(soundOff);

    }
}
