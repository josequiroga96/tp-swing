import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by JoseRojas on 7/3/17.
 */
public class Controller implements ActionListener{

    MainWindow mainWindow;
    StartWindow startWindow;
    SettingsWindow settingsWindow;

    InputStream ins;
    AudioStream mAudio;

    public Controller() {

        mainWindow = new MainWindow(this);
        mainWindow.setVisible(true);

        startWindow = new StartWindow(this);
        startWindow.setVisible(false);

        settingsWindow = new SettingsWindow(this);
        settingsWindow.setVisible(false);

        File marioSong = new File("src/mario_kart_8_mario_kart_stadium_vmusice.wav");
        try{
            ins = new FileInputStream(marioSong);
            mAudio = new AudioStream(ins);
        }
        catch (IOException e){
            System.out.println("No se encuentra el archivo");
        }


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonSelected = e.getSource();

        if(buttonSelected.equals(mainWindow.button1)){
            mainWindow.setVisible(false);
            mainWindow.setLocationRelativeTo(null);
            startWindow.setVisible(true);

            if(settingsWindow.getMusicPanel().musicOn.isSelected()){
                AudioPlayer.player.start(mAudio);
            }
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

            AudioPlayer.player.stop(mAudio);

            settingsWindow.setLocationRelativeTo(null);
            startWindow.setLocationRelativeTo(null);
        }
    }

    public void printSelect(){
        System.out.println("Game Settings: \n");
        System.out.println(settingsWindow.getSoundPanel().soundOn.isSelected() ? "Sound:    On" : "Sound:    Off");
        System.out.println(settingsWindow.getMusicPanel().musicOn.isSelected() ? "Music:    On" : "Music:    Off ");
        System.out.println(settingsWindow.getGraphicsPanel().shadowsButton.isSelected() ? "Shadows:    On" : "Shadows:    Off ");
        System.out.println(settingsWindow.getGraphicsPanel().antiAliasingButton.isSelected() ? "Anti-Aliasing:    On" : "Anti-Aliasing:    Off ");
        System.out.println("- - - - - - - - - - - - - - - -");
    }
}
