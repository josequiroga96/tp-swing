import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Created by JoseRojas on 6/3/17.
 */
public class MainWindow extends JFrame{

    public MainWindow(){
        super("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);

        JPanel thePanel = new JPanel();
        add(thePanel);

        JButton button1 = new JButton("Start Game");
        JButton button2 = new JButton("Settings");
        JButton button3 = new JButton("Exit");

        JLabel tpSwing = new JLabel("tpSwing");
        JLabel names = new JLabel("José Rojas  Tomas Shilton");

        thePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        thePanel.add(tpSwing);
        thePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        thePanel.add(names);
        thePanel.add(Box.createRigidArea(new Dimension(0, 20)));
        tpSwing.setAlignmentX(Component.CENTER_ALIGNMENT);
        names.setAlignmentX(Component.CENTER_ALIGNMENT);

        thePanel.add(button1);
        thePanel.add(Box.createRigidArea(new Dimension(0, 15)));
        thePanel.add(button2);
        thePanel.add(Box.createRigidArea(new Dimension(0, 15)));
        thePanel.add(button3);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);


        thePanel.setLayout(new BoxLayout(thePanel, BoxLayout.Y_AXIS));

        Controller controller = new Controller();

        button1.addActionListener(controller);
                /*new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StartWindow game = new StartWindow();
                hide();
            }
        });*/

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingsWindow setting = new SettingsWindow();
                hide();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}