import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyGUI{
    public String username = "";
    public String password = "";

    public MyGUI(){

        JFrame myFrame = new JFrame();
        myFrame.setSize(800,500);
        myFrame.setBackground(Color.green);


        JPanel myPanel = new JPanel();
        myPanel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        myPanel.setLayout(new GridLayout(4,1));

        myPanel.setBackground(Color.RED);

        JTextField login = new JTextField(5);
        login.setText("LOGIN");



        JTextField user = new JTextField(10);
        user.setSize(4,1);
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = user.getText();
                check();

            }
        });


        JTextField pass = new JTextField(10);


        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                password = pass.getText();
                check();

            }
        });


        myPanel.add(login);
        myPanel.add(user);
        myPanel.add(pass);
        myPanel.add(check());










        myFrame.add(myPanel);
        myFrame.setVisible(true);









    }
    public JLabel check(){
        JLabel pic = new JLabel();

        if(username.equals("BENN") && password.equals("ni")) {
            System.out.println("hi");

            ImageIcon icon = new ImageIcon("BEN.png");
            icon.setImage(icon.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
           pic  = new JLabel(icon);

        };

        return pic;
    }


}