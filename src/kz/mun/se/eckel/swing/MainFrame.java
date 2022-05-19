package kz.mun.se.eckel.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private BestApplication bestApplication;
    private AddStudentForm addStudentForm;
    private ListStudents listStudents;

    public BestApplication getBestApplication() {
        return bestApplication;
    }

    public AddStudentForm getAddStudentForm() {
        return addStudentForm;
    }

    public ListStudents getListStudents() {
        return listStudents;
    }

    public MainFrame() {
        setSize(600, 800);
        setTitle("STUDENT APPLICATION");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bestApplication = new BestApplication(this);
        bestApplication.setVisible(true);
        add(bestApplication);

        addStudentForm = new AddStudentForm(this);
        addStudentForm.setVisible(false);
        add(addStudentForm);

        listStudents = new ListStudents(this);
        listStudents.setVisible(false);
        add(listStudents);
    }
}
