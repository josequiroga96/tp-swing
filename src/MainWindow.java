import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame{

    private Controller controller;
    JButton button1;
    JButton button2;
    JButton button3;

    /**
     * Creates the main window with certain settings.
     */

    public MainWindow(Controller controller){
        super("Main Menu");
        this.controller=controller;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel thePanel = new JPanel();

        button1 = new JButton("Start game");
        button2 = new JButton("Settings");
        button3 = new JButton("Exit");



        JLabel tpSwing = new JLabel("Trabajo Práctico Swing");
        JLabel names = new JLabel("José Rojas  Tomas Shilton");


        /**
         * Sets labels distribution.
         */
        thePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        thePanel.add(tpSwing);
        thePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        thePanel.add(names);
        thePanel.add(Box.createRigidArea(new Dimension(0, 20)));
        tpSwing.setAlignmentX(Component.CENTER_ALIGNMENT);
        names.setAlignmentX(Component.CENTER_ALIGNMENT);

        /**
         * Sets the same size for all buttons.
         */
        Dimension buttonSize = new Dimension(150, 40);
        button1.setMinimumSize(buttonSize);
        button1.setMaximumSize(button1.getMinimumSize());
        button2.setMinimumSize(buttonSize);
        button2.setMaximumSize(button2.getMinimumSize());
        button3.setMinimumSize(buttonSize);
        button3.setMaximumSize(button3.getMinimumSize());

        /**
         * Sets buttons distribution.
         */
        thePanel.add(button1);
        thePanel.add(Box.createRigidArea(new Dimension(0, 15)));
        thePanel.add(button2);
        thePanel.add(Box.createRigidArea(new Dimension(0, 15)));
        thePanel.add(button3);
        button1.setAlignmentX(CENTER_ALIGNMENT);
        button2.setAlignmentX(CENTER_ALIGNMENT);
        button3.setAlignmentX(CENTER_ALIGNMENT);


        thePanel.setLayout(new BoxLayout(thePanel, BoxLayout.Y_AXIS));
        add(thePanel);



        button1.addActionListener(controller);

        button2.addActionListener(controller);

        button3.addActionListener(controller);

    }
}
