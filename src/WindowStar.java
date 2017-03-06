import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class WindowStar extends JFrame {
    public WindowStar(String name){
        super(name);
        Toolkit myScreen= Toolkit.getDefaultToolkit();
        Dimension sizeScreen = myScreen.getScreenSize();
        int hightScreen = sizeScreen.height;
        int widthSreen = sizeScreen.width;
        setBounds(widthSreen/4, hightScreen/4, widthSreen/2, hightScreen/2);
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        setVisible(true);

        ImagePanel imageP = new ImagePanel();
        add(imageP);

        PanelButtonStar pbs = new PanelButtonStar();
        //add(pbs);
    }
}
class ImagePanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File myImage = new File("src/Pac-Man_-_Pac-Man_Collection_(GBA).png");
        try {
            imagen = ImageIO.read(myImage);
        }
        catch (IOException e){
            System.out.println("La imagen no se encuentra");
        }

        g.drawImage(imagen, 1, 1, null);
    }

    private Image imagen;
}
