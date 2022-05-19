package kz.mun.se.eckel.swing;

import com.sun.tools.javac.Main;
import kz.mun.se.eckel.swing.models.Student;
import kz.mun.se.eckel.swing.services.StudentsService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentForm extends JPanel {

    private MainFrame parent;

    private JLabel labelStudentName;
    private JTextField textFieldStudentName;
    private JLabel labelStudentSurname;
    private JTextField textFieldStudentSurname;
    private JLabel labelFaculty;
    private JTextField textFieldFaculty;
    private JLabel labelGroup;
    private JTextField textFieldGroup;
    private JButton btnSubmit;
    private JButton btnHome;

    public AddStudentForm(MainFrame parent) {

        this.parent = parent;

        setSize(600, 800);
        setLayout(null);

        labelStudentName = new JLabel("Name");
        labelStudentName.setSize(100, 30);
        labelStudentName.setLocation(90, 100);

        textFieldStudentName = new JTextField();
        textFieldStudentName.setSize(300, 30);
        textFieldStudentName.setLocation(200, 100);

        labelStudentSurname = new JLabel("Surname");
        labelStudentSurname.setSize(100, 30);
        labelStudentSurname.setLocation(90, 140);

        textFieldStudentSurname = new JTextField();
        textFieldStudentSurname.setSize(300, 30);
        textFieldStudentSurname.setLocation(200, 140);

        labelFaculty = new JLabel("Faculty");
        labelFaculty.setSize(100, 30);
        labelFaculty.setLocation(90, 180);

        textFieldFaculty = new JTextField();
        textFieldFaculty.setSize(300, 30);
        textFieldFaculty.setLocation(200, 180);

        labelGroup = new JLabel("Group");
        labelGroup.setSize(100, 30);
        labelGroup.setLocation(90, 220);

        textFieldGroup = new JTextField();
        textFieldGroup.setSize(300, 30);
        textFieldGroup.setLocation(200, 220);

        btnSubmit = new JButton("Submit");
        btnSubmit.setSize(200, 30);
        btnSubmit.setLocation(90, 260);

        btnHome = new JButton("Home");
        btnHome.setSize(200, 30);
        btnHome.setLocation(300, 260);

        add(labelStudentName);
        add(textFieldStudentName);
        add(labelStudentSurname);
        add(textFieldStudentSurname);
        add(labelFaculty);
        add(textFieldFaculty);
        add(labelGroup);
        add(textFieldGroup);
        add(btnSubmit);
        add(btnHome);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student = new Student(
                        0,
                        textFieldStudentName.getText(),
                        textFieldStudentSurname.getText(),
                        textFieldFaculty.getText(),
                        textFieldGroup.getText()
                );
                StudentsService.addStudent(student);
                textFieldStudentName.setText("");
                textFieldStudentSurname.setText("");
                textFieldFaculty.setText("");
                textFieldGroup.setText("");
            }
        });

        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getAddStudentForm().setVisible(false);
                parent.getBestApplication().setVisible(true);
            }
        });
    }
}
