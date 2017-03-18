import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MusicPanel extends JPanel{

    JRadioButton musicOn;

    /**
     * Creates a music panel with certain settings ready to be added to the Settings Window.
     */

    public MusicPanel(Controller controller){

        musicOn = new JRadioButton("On");
        JRadioButton musicOff = new JRadioButton("Off");
        JLabel musicLabel = new JLabel("Music:");

        add(musicLabel);
        add(musicOn);
        add(musicOff);

        ButtonGroup musicGroup = new ButtonGroup();
        musicGroup.add(musicOn);
        musicGroup.add(musicOff);
        musicOn.setSelected(true);

        musicOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.printSelect();
            }
        });
        musicOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.printSelect();
            }
        });

    }
}
