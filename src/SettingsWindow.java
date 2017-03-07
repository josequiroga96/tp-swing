import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class SettingsWindow extends JFrame {
    Controller controller;
    JButton back;

    public SettingsWindow(Controller controller){
        this.controller=controller;
        setTitle("Settings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel buttonPanel = new JPanel();
        add(buttonPanel);

        back = new JButton("Back");
        buttonPanel.add(back);

        back.addActionListener(controller);
    }
}
