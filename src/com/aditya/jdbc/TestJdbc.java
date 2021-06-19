package com.aditya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String password = "hbstudent";

        Connection myConnection;

        {
            try {
                myConnection = DriverManager.getConnection(jdbcurl, user, password);
                System.out.println("Connection successful");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}
