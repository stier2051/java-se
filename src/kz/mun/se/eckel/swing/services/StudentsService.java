package kz.mun.se.eckel.swing.services;

import kz.mun.se.eckel.swing.models.Student;

public class StudentsService {

    private static int index = 0;
    private static Student[] students = new Student[100];

    public static void addStudent(Student student) {
        student.setId(index);
        students[index] = student;
        index++;
    }

    public static Student[] getAllStudents() {
        return students;
    }
}
