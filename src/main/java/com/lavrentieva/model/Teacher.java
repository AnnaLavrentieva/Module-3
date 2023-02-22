package com.lavrentieva.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "teacher_id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private int age;

    @OneToOne(mappedBy = "teacher")
    private Subject subject;

    public Teacher() {
    }

    @Override
    public String toString() {
        return String.format("Teacher:{%s %s, age: %s, id: %s, subject: %s}",
                firstName, lastName, age, id, subject.getSubjectName());
    }
}
