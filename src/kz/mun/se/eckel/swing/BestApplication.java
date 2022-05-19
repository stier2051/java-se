package kz.mun.se.eckel.swing;

import kz.mun.se.eckel.swing.models.Student;
import kz.mun.se.eckel.swing.services.StudentsService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BestApplication extends JPanel {
    private MainFrame parent;

    private JButton btnAddStudent;
    private JButton btnListStudent;
    private JButton btnExit;
    private JTextArea textArea;

    public BestApplication(MainFrame parent) {
        this.parent = parent;

        setSize(600, 800);
        setLayout(null);

        btnAddStudent = new JButton("ADD STUDENT");
        btnAddStudent.setSize(200, 30);
        btnAddStudent.setLocation(200, 140);

        btnListStudent = new JButton("LIST STUDENTS");
        btnListStudent.setSize(200, 30);
        btnListStudent.setLocation(200, 180);

        btnExit = new JButton("EXIT");
        btnExit.setSize(200, 30);
        btnExit.setLocation(200, 220);

        add(btnAddStudent);
        add(btnListStudent);
        add(btnExit);

        btnAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getBestApplication().setVisible(false);
                parent.getAddStudentForm().setVisible(true);
            }
        });

        btnListStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getBestApplication().setVisible(false);
                parent.getListStudents().setVisible(true);
                parent.getListStudents().printStudents();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
