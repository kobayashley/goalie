package main.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
        int buttonx;
        int buttony;
        int buttonwidth;
        int height;
        JButton b;
        JFrame f;
    {
        buttonx = 130;
    }
public void GUI(){
    buttony = 100;
    buttonwidth = 100;
    height = 40;

    f = new JFrame();
    final JTextField textfield = new JTextField();

    b = new JButton("hi");
    b.setBounds(buttonx, buttony, buttonwidth, height);

    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            textfield.setText("Welcome to Javatpoint.");
        }
    });

    f.add(b);
    f.add(textfield);
    f.setSize(400,500);//400 width and 500 height
    f.setLayout(null);//using no layout managers
    f.setVisible(true);//making the frame visible

    }
}

