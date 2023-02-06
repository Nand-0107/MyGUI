import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyGUI {
    public String username = "";
    public String password = "";

    public MyGUI() {

        JFrame myFrame = new JFrame();
        myFrame.setSize(800, 500);
        myFrame.setBackground(Color.green);


        JPanel myPanel = new JPanel();
        myPanel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        myPanel.setLayout(new GridLayout(4, 1));

        myPanel.setBackground(Color.RED);

        JTextField login = new JTextField(5);
        login.setText("LOGIN");


        JTextField user = new JTextField(10);
        user.setSize(4, 1);
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = user.getText();
                check();

            }
        });


       JPasswordField pass = new JPasswordField(10);


        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                password = pass.getText();
                check();
                myPanel.add(check());

            }
        });


        myPanel.add(login);
        myPanel.add(user);
        myPanel.add(pass);


        myFrame.add(myPanel);
        myFrame.setVisible(true);


    }

    public JLabel check() {
        JLabel pic = new JLabel();

        if (username.equals("ben.esch23") && password.equals("IloveMeth")) {
            System.out.println("hi");


            ImageIcon icon = new ImageIcon("BEN.png");
            JOptionPane.showMessageDialog(null, "BEN", "Bwn", JOptionPane.INFORMATION_MESSAGE, icon);

        }

        if (username.equals("zack.mcmahon25") && password.equals("wacker")) {
            System.out.println("hi");


            ImageIcon icon = new ImageIcon("zack.png");
            JOptionPane.showMessageDialog(null, "BEN", "ZACK", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        if (username.equals("noel.ortiz25") && password.equals("Nonsense")) {
            System.out.println("hi");


            ImageIcon icon = new ImageIcon("noel.png");
            JOptionPane.showMessageDialog(null, "BEN", "NOEL", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        if (username.equals("tyler.mock24") && password.equals("thunder")) {
            System.out.println("hi");


            ImageIcon icon = new ImageIcon("tmok.png");
            JOptionPane.showMessageDialog(null, "BEN", "TMOK", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        if (username.equals("phil.anlauf23") && password.equals("billyphilly")) {
            System.out.println("hi");


            ImageIcon icon = new ImageIcon("phill.png");
            JOptionPane.showMessageDialog(null, "BEN", "PHILL", JOptionPane.INFORMATION_MESSAGE, icon);
        }
//            icon.setImage(icon.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
//            pic  = new JLabel(icon);
//            JOptionPane bill = new JOptionPane();
//            bill.add(pic);
        return pic;
    };
}

