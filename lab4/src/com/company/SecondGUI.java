package com.company;

import javax.management.remote.SubjectDelegationPermission;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondGUI extends JFrame {

    JLabel     label         = new JLabel("Введите имя:");
    JTextField textFieldName = new JTextField("Джон Сноу", 1);
    JButton    button        = new JButton("Всё готово");
    JCheckBox  checkBox      = new JCheckBox("Согласны?", true);

    public SecondGUI(){
        super("Простая программа");
        this.setBounds(400, 200, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2));
        container.add(label);
        container.add(textFieldName);
        container.add(button);
        container.add(checkBox);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox.isSelected())
                    System.out.println("Выбрано имя " + textFieldName.getText());
            }
        });
    }


}
