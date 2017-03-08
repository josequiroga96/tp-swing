import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class GraphicsPanel extends JPanel {

    private boolean shadows;
    private boolean antiAliasing;

    public GraphicsPanel(Controller controller){
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

        shadowsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(shadows == false){
                    shadows = true;
                    controller.setShadows(true);
                }
                if(shadows == true){
                    shadows = false;
                    controller.setShadows(false);
                }
            }
        });
        antiAliasingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(antiAliasing == false){
                    antiAliasing = true;
                    controller.setAntiAliasing(true);
                }
                if(antiAliasing == true){
                    antiAliasing = false;
                    controller.setAntiAliasing(false);
                }
            }
        });

    }
}
