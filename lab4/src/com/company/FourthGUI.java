package com.company;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

public class FourthGUI extends JFrame {

    JTextField  textField   =   new JTextField("Привет");
    JButton     button      =   new JButton("Отобразить");

    public FourthGUI(){
        super("Простая программа");
        this.setBounds(500, 400, 300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.setBackground(Color.red);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 2));
        container.add(textField);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            textField.getText());
                }
            }
        });
    }
}
