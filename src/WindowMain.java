import javax.swing.*;
import java.awt.*;


public class WindowMain extends JFrame {

    public WindowMain(){
        super("Main menu");
        setVisible(true);
        setBounds(300, 250, 300, 250);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setResizable(false);;

        PanelButtonMain pB = new PanelButtonMain();
        pB.setLayout(new BoxLayout(pB, BoxLayout.Y_AXIS));
        add(pB);
    }
}
