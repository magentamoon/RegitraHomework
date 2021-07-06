package menu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {


    public MainWindow (){

        this.setSize(800,600);
        this.setTitle("Regitra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.decode("#f4f4f4"));

        JLabel mainTitle = new JLabel("Vehicle Menu");
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitle.setBorder(new LineBorder(Color.RED));
        this.add(BorderLayout.NORTH,mainTitle);

        //MAIN MENU BORDER CENTER
        JPanel body = new JPanel();
        body.setLayout(new FlowLayout());


        //REGISTRATION BUTTON
        JButton registrationButton = new JButton();
        registrationButton.setText("REGISTER");
        body.add(registrationButton);
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               registrationButton();
               System.out.println("button pressed");
            }
        });

        //FIND BUTTON

        JButton findButton = new JButton();
        findButton.setText("FIND");
        findButton.setBorder(new LineBorder(Color.CYAN));
        findButton.setPreferredSize(new Dimension(50,20));

        body.add(findButton);


        //ADDING BODY TO BORDERLAYOUT CENTER
        this.add(BorderLayout.CENTER, body);




    }

    private void registrationButton(){
        RegistrationWindow registrationWindow = new RegistrationWindow();
        this.setVisible(false);
        registrationWindow.setVisible(true);
    }











}
