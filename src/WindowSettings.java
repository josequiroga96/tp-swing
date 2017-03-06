import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoseRojas on 6/3/17.
 */
public class WindowSettings extends JFrame {
    public WindowSettings(String name){
        super(name);
        Toolkit myScreen= Toolkit.getDefaultToolkit();
        Dimension sizeScreen = myScreen.getScreenSize();
        int hightScreen = sizeScreen.height;
        int widthSreen = sizeScreen.width;
        setBounds(widthSreen/4, hightScreen/4, widthSreen/2, hightScreen/2);
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        setVisible(true);

        WindowCheck hshs = new WindowCheck();
    }
}

class WindowCheck extends JPanel{
    private JLabel text;
    private JCheckBox check1, check2;

    public WindowCheck(){
        setLayout(new BorderLayout());

        Font miLetra = new Font("Serif", Font.PLAIN, 24);
        text = new JLabel("Poco tiempo para el tp :S");
        text.setFont(miLetra);

        JPanel laminaTexto = new JPanel();

        laminaTexto.add(text);

        add(laminaTexto, BorderLayout.CENTER);
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox(("Cursiva"));
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        JPanel laminaCheck = new JPanel();
        laminaCheck.add(check1);
        laminaCheck.add(check2);
        add(laminaCheck, BorderLayout.SOUTH);
    }
    private class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}

