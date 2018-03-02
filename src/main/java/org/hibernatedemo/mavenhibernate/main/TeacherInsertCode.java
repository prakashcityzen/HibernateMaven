package org.hibernatedemo.mavenhibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatedemo.mavenhibernate.demos.Student;
import org.hibernatedemo.mavenhibernate.demos.Teacher;

public class TeacherInsertCode {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Teacher teacher=new Teacher(); //select * from itn_teacher where salary<<40000
        teacher.setTeacherName("pg");
        teacher.setTeacherSalary(40000);
        teacher.setTeacherName("ag");
        teacher.setTeacherSalary(4000);


        session.persist(teacher); //insert into table_name("
        session.beginTransaction().commit();
        session.close();
    }
}
