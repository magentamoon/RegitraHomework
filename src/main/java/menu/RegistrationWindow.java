package menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RegistrationWindow extends JFrame {

    public RegistrationWindow (){

        this.setSize(800,600);
        this.setTitle("Regitra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.decode("#f4f4f4"));

        JLabel mainTitle = new JLabel("Registration Menu");
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitle.setBorder(new LineBorder(Color.RED));
        this.add(BorderLayout.NORTH,mainTitle);

        JPanel body = new JPanel();
        body.setLayout( new FlowLayout());


        JRadioButton carRadioButton = new JRadioButton("CAR");
        JRadioButton motorcycleRadioButton = new JRadioButton("MOTORCYCLE");
        JRadioButton truckRadioButton = new JRadioButton("TRUCK");
        body.add(carRadioButton);
        body.add(motorcycleRadioButton);
        body.add(truckRadioButton);




        this.add(BorderLayout.CENTER, body);







    }


}
