package org.hibernatedemo.mavenhibernate.demos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="itn_student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable{ //itn_student(id(primary autoincrement),name,address);

    private static long serialVersionUID=1234L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="student_name")
    private String name;
    @Column(name="student_address")
    private String address;
    @Column(name="student_roll")
    private int roll;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tid")
    //@Index("index")
    private List<Teacher> teacher;
}
