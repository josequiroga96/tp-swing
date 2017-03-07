import javax.swing.*;
import java.awt.*;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class WindowMainnnnnn extends JFrame {

    public WindowMainnnnnn(String name){
        super(name);
        setBounds(300, 250, 300, 250);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        pack();
        setResizable(false);

        PanelButtonMain pB = new PanelButtonMain();
        pB.setLayout(new BoxLayout(pB, BoxLayout.Y_AXIS));
        add(pB);
    }
}
