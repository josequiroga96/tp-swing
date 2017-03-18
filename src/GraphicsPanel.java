import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GraphicsPanel extends JPanel {

    JCheckBox shadowsButton;
    JCheckBox antiAliasingButton;

    /**
     * Creates a graphics panel with certain settings ready to be added to the Settings Window.
     */

    public GraphicsPanel(Controller controller){
        JPanel gPanel = new JPanel();
        JPanel saPanel = new JPanel();

        JLabel graphicsLabel = new JLabel("Graphics:                        ");
        shadowsButton = new JCheckBox("Shadows");
        antiAliasingButton = new JCheckBox("Anti-aliasing");

        gPanel.add(graphicsLabel);
        saPanel.add(shadowsButton);
        saPanel.add(antiAliasingButton);

        add(gPanel);
        add(saPanel);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        shadowsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.printSelect();
            }
        });
        antiAliasingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.printSelect();
            }
        });

    }
}
