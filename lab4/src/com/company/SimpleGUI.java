package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private JButton     button     = new JButton("Нажми");
    private JTextField  textField1 = new JTextField("Привет", 1);
    private JTextField  textField2 = new JTextField("Мир", 1);

    public SimpleGUI(){
        super("Простая программа");
        this.setBounds(200, 200, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(textField1);
        container.add(textField2);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажал");
            }
        });
    }
}
