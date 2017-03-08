import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class StartWindow extends JFrame {
    JButton back;
    Controller controller;

    public StartWindow(Controller controller){
        this.controller=controller;
        back = new JButton("Back");
        setTitle("Mario Kart 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 668);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel thePanel = new JPanel();
        add(thePanel);

        back.addActionListener(controller);


        thePanel.setLayout(new BorderLayout());
        thePanel.add(back, BorderLayout.SOUTH);

        ImageIcon marioKart = new ImageIcon(getClass().getResource("mario_kart_8_arcade_racing_may_2014_mario_toadette_daisy_koopa_troopa_bowser_donkey_kong_luigi_waluigi_peach_93324_3840x2400-1024x640.jpg"));
        JLabel imageLabel = new JLabel(marioKart);
        thePanel.add(imageLabel, BorderLayout.CENTER);

    }
}
