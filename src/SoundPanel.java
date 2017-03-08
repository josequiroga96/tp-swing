import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SoundPanel extends JPanel{

    JRadioButton soundOn;

    /**
     * Creates a sound panel with certain settings ready to be added to the Settings Window.
     */

    public SoundPanel(Controller controller) {

        soundOn = new JRadioButton("On");
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
                controller.printSelect();
            }
        });
        soundOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.printSelect();
            }
        });

    }
}
