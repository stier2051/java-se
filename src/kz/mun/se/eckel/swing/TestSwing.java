package kz.mun.se.eckel.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwing {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Best Application");
//        myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        myFrame.setSize(1000, 1200);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Имя");
        label.setSize(300, 30);
        label.setLocation(100, 100);

        JTextField textField = new JTextField();
        textField.setSize(300, 30);
        textField.setLocation(100, 140);

        JButton button = new JButton("Submit");
        button.setSize(120, 30);
        button.setLocation(100, 180);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        myFrame.add(label);
        myFrame.add(textField);
        myFrame.add(button);
    }
}
