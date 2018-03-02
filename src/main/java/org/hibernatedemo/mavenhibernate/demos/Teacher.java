package org.hibernatedemo.mavenhibernate.demos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="itn_teacher")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher implements Serializable{ //static and transient are not serializable
    private static long serialVersionUID=345L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int tId;
    @Column(name="name")
    private String teacherName;
    @Column(name="salary")
    private int teacherSalary;

}
