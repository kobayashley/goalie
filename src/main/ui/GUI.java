package main.ui;

import javax.swing.*;

public class GUI {
        int buttonx;
        int buttony;
        int buttonwidth;
        int height;
    {
        buttonx = 130;
    }
public void GUI(){
    buttony = 100;
    buttonwidth = 100;
    height = 40;

    JFrame f = new JFrame();

    JButton b = new JButton("hi");
    b.setBounds(buttonx, buttony, buttonwidth, height);
    f.add(b);

    f.setSize(400,500);//400 width and 500 height
    f.setLayout(null);//using no layout managers
    f.setVisible(true);//making the frame visible
}
}

