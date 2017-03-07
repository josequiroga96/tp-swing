import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class Controller implements ActionListener{

    MainWindow mainWindow;
    StartWindow startWindow;
    SettingsWindow settingsWindow;


    public Controller() {

        mainWindow = new MainWindow(this);
        mainWindow.setVisible(true);

        startWindow = new StartWindow(this);
        startWindow.setVisible(false);

        settingsWindow = new SettingsWindow(this);
        settingsWindow.setVisible(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonSelected = e.getSource();

        if(buttonSelected.equals(mainWindow.button1)){
            mainWindow.setVisible(false);
            mainWindow.setLocationRelativeTo(null);
            startWindow.setVisible(true);
        }
        if(buttonSelected.equals(mainWindow.button2)){
            mainWindow.setVisible(false);
            mainWindow.setLocationRelativeTo(null);
            settingsWindow.setVisible(true);
        }
        if(buttonSelected.equals(mainWindow.button3)){
            System.exit(0);
        }
        if((buttonSelected.equals(startWindow.back)) || (buttonSelected.equals(settingsWindow.back))){
            mainWindow.setVisible(true);
            settingsWindow.setVisible(false);
            startWindow.setVisible(false);

            settingsWindow.setLocationRelativeTo(null);
            startWindow.setLocationRelativeTo(null);
        }
    }
}
