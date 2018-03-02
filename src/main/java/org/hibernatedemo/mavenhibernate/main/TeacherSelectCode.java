package org.hibernatedemo.mavenhibernate.main;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernatedemo.mavenhibernate.demos.Student;
import org.hibernatedemo.mavenhibernate.demos.Teacher;

import java.util.List;

public class TeacherSelectCode {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();

        Criteria criteria=session.createCriteria(Teacher.class);
       /* criteria.setFirstResult(1); //minimum
        criteria.setMaxResults(1); //maximum*/ //pagination
        criteria.add(Restrictions.lt("teacherSalary",20000));
        criteria.addOrder(Order.desc("teacherSalary"));
        //criteria.setProjection(Projections.property("teacherName"));
        List<Teacher> teachers=criteria.list();
        session.close();

        for(Teacher teacher:teachers){
            System.out.println(teacher.getTId()+""+teacher.getTeacherSalary()+""+teacher.getTeacherName());

        }

    }
}
