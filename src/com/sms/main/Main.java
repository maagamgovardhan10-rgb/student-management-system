package com.sms.main;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;

public class Main {

    public static void main(String[] args) {

        Student s = new Student(1, "Govardhan", 21, "CSE");

        StudentDAO dao = new StudentDAO();

        dao.addStudent(s);
    }
}