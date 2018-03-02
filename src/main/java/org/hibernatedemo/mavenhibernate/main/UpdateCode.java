package org.hibernatedemo.mavenhibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatedemo.mavenhibernate.demos.Student;

public class UpdateCode {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Student student= new Student();
        student.setId(2);
        student.setAddress("dhumbarahi");
        student.setName("Madhu");
        student.setRoll(5);

        session.update(student); //insert into table_nmae("
        session.beginTransaction().commit();
        session.close();
    }
}
