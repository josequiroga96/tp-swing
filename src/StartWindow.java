import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class StartWindow extends JFrame {
    public StartWindow(){
        setTitle("Mario Kart 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);

        JPanel thePanel = new JPanel();
        add(thePanel);

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow returnB = new MainWindow();
                hide();
            }
        });


        thePanel.setLayout(new BorderLayout());
        thePanel.add(back, BorderLayout.SOUTH);

        ImageIcon marioKart = new ImageIcon(getClass().getResource("mario_kart_8_arcade_racing_may_2014_mario_toadette_daisy_koopa_troopa_bowser_donkey_kong_luigi_waluigi_peach_93324_3840x2400-1024x640.jpg"));
        JLabel imageLabel = new JLabel(marioKart);
        thePanel.add(imageLabel, BorderLayout.CENTER);

    }
}
