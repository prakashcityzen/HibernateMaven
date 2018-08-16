package org.hibernatedemo.mavenhibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatedemo.mavenhibernate.demos.Student;
import org.hibernatedemo.mavenhibernate.demos.Teacher;

import javax.security.auth.login.Configuration;
import java.util.List;

import static sun.misc.Version.print;

public class SelectCode {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        List<Student> studentList = session.createCriteria(Teacher.class).list();
        session.close();
        print("demo");
        for (Student s : studentList) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAddress() + " " + s.getRoll());

        }


    }
}
