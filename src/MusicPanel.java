import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class MusicPanel extends JPanel{



    public MusicPanel(Controller controller){

        JRadioButton musicOn = new JRadioButton("On");
        JRadioButton musicOff = new JRadioButton("Off");
        JLabel musicLabel = new JLabel("Music:");

        add(musicLabel);
        add(musicOn);
        add(musicOff);

        ButtonGroup musicGroup = new ButtonGroup();
        musicGroup.add(musicOn);
        musicGroup.add(musicOff);

        musicOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMusic(true);
                //controller.printSelect();
            }
        });
        musicOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMusic(false);
                //controller.printSelect();
            }
        });

    }
}
