package org.hibernatedemo.mavenhibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatedemo.mavenhibernate.demos.Student;
import org.hibernatedemo.mavenhibernate.demos.Teacher;

import java.util.List;

public class SelectCode {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();

        List<Student> studentList=session.createCriteria(Teacher.class).list();
        session.close();

        for(Student s: studentList){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress()+" "+s.getRoll());

        }


    }
}
