package com.aditya.hibernate.demo;

import com.aditya.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration()
                                            .configure("hibernate.cfg.xml")
                                            .addAnnotatedClass(Student.class)
                                            .buildSessionFactory();

        //create session
        Session session = sessionFactory.getCurrentSession();

        try{

            Student tempStudent = new Student("Aditya","Kumar","aditya@gmail.com");

            session.beginTransaction();
            session.save(tempStudent);
            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
