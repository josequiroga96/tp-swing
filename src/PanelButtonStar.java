import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class PanelButtonStar extends JPanel implements ActionListener {
    JButton button = new JButton("Back");

    public PanelButtonStar(){
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
