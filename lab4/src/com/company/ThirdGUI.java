package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdGUI extends JFrame {

    JLabel      label     = new JLabel("Введите число");
    JTextField  textField = new JTextField("");
    JButton     button    = new JButton("Скрыть поле");

    boolean     isHidden  = false;

    public ThirdGUI(){
        super("Простая программа");
        this.setBounds(200, 400, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.setBackground(Color.red);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2));
        container.add(label);
        container.add(textField);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isHidden){
                    textField.setVisible(true);
                    button.setText("Скрыть поле");
                    isHidden = false;
                }
                else
                {
                    textField.setVisible(false);
                    button.setText("Показать поле");
                    isHidden = true;
                }
            }
        });
    }
}
