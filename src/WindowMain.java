import javax.swing.*;
import java.awt.*;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class WindowMain extends JFrame {

    public WindowMain(String name){
        super(name);
        setBounds(200, 300, 300, 500);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setVisible(true);
        //pack();
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);

        PanelButtonMain pB = new PanelButtonMain();
        pB.setLayout(new BoxLayout(pB, BoxLayout.Y_AXIS));
        add(pB);
    }
}
