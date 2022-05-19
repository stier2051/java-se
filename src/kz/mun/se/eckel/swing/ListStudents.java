package kz.mun.se.eckel.swing;

import kz.mun.se.eckel.swing.models.Student;
import kz.mun.se.eckel.swing.services.StudentsService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudents extends JPanel {

    private MainFrame parent;

    private JTextArea textArea;
    private JButton btnHome;

    public ListStudents(MainFrame parent) {
        setSize(600, 800);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setSize(400, 400);
        textArea.setLocation(100, 100);

        btnHome = new JButton("HOME");
        btnHome.setSize(200, 30);
        btnHome.setLocation(200, 550);

        add(textArea);
        add(btnHome);

        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                parent.getListStudents().setVisible(false);
                parent.getBestApplication().setVisible(true);
            }
        });
    }

    public void printStudents() {
        Student[] students = StudentsService.getAllStudents();
        for (Student student: students) {
            if (student != null) textArea.append(student.getStudentData() + "\n");
            else break;
        }
    }
}
