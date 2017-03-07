import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class PanelButtonMain extends JPanel /*implements ActionListener*/ {
    JButton button1 = new JButton("Start Game");
    JButton button2 = new JButton("Settings");
    JButton button3 = new JButton("Exit");

    public PanelButtonMain(){
        add(button1);
        add(button2);
        add(button3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WindowStar wS = new WindowStar("Star Game");
                WindowMainnnnnn.getFrames()[0].setVisible(falsePan);
            }
        });
        //button1.addActionListener(this);
        //button2.addActionListener(this);
        //button3.addActionListener(this);
    }

    //@Override
    //public void actionPerformed(ActionEvent e) {
    //    Object button = e.getSource();
    //    if(button == button1){
    //        WindowStar wS = new WindowStar("Star Game");
    //    }
    //    if(button == button2){
    //        WindowSettings wS = new WindowSettings("Settings");
    //    }
    //    if(button == button3){
    //       System.exit(0);
    //    }
    //}

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Trabajo Práctico Swing", 580, 25);
        g.drawString("José Rojas  Tomas Shilton", 570, 50);
    }
}
