import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class WindowMain extends JFrame {

    /*public WindowMain(){
        super("Main menu");
        setVisible(true);
        setBounds(300, 250, 300, 250);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setResizable(false);;*/

/**
 * Created by JoseRojas on 6/3/17.
 */
public class WindowMain extends JFrame{

    public WindowMain(){
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        //this.pack();


        JPanel thePanel = new JPanel();
        add(thePanel);

        JButton button1 = new JButton("Start Game");
        JButton button2 = new JButton("Settings");
        JButton button3 = new JButton("Exit");
        thePanel.add(button1);
        thePanel.add(button2);
        thePanel.add(button3);

        thePanel.setLayout(new BoxLayout(thePanel, BoxLayout.Y_AXIS));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WindowStart game = new WindowStart();
                hide();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WindowSetting setting = new WindowSetting();
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
