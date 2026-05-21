package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sms.model.Student;
import com.sms.util.DBConnection;

public class StudentDAO {

    public void addStudent(Student s) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
