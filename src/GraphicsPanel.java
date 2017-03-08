import javax.swing.*;
import java.awt.*;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class GraphicsPanel extends JPanel {

    public GraphicsPanel(){
        JPanel gPanel = new JPanel();
        JPanel saPanel = new JPanel();

        JLabel graphicsLabel = new JLabel("Graphics:                        ");
        JCheckBox shadowsButton = new JCheckBox("Shadows");
        JCheckBox antiAliasingButton = new JCheckBox("Anti-aliasing");

        gPanel.add(graphicsLabel);
        saPanel.add(shadowsButton);
        saPanel.add(antiAliasingButton);

        add(gPanel);
        add(saPanel);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }
}
