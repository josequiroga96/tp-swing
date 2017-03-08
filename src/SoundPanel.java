import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class SoundPanel extends JPanel{



    public SoundPanel(Controller controller) {

        JRadioButton soundOn = new JRadioButton("On");
        JRadioButton soundOff = new JRadioButton("Off");
        JLabel soundLabel = new JLabel("Sound:");

        add(soundLabel);
        add(soundOn);
        add(soundOff);

        ButtonGroup soundGroup = new ButtonGroup();
        soundGroup.add(soundOn);
        soundGroup.add(soundOff);
        soundOn.setSelected(true);

        soundOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setSound(false);
            }
        });
        soundOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setSound(true);
            }
        });

    }
}
