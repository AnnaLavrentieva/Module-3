package com.lavrentieva.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "student_id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private int age;

    @ManyToOne()
    @JoinColumn(name = "university_group_id")
    private UniversityGroup universityGroup;

    @Column(name = "entry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Grade> grades;

    public Student() {
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return String.format("Student:{%s %s, age: %s, entry date: %s, id: %s, group: %s}",
                firstName, lastName, age, simpleDateFormat.format(entryDate), id,
                universityGroup.getGroupName());
    }

    public static class Builder {
        private Student student;

        public Builder() {
            student = new Student();
        }

        public Builder withFirstName(String firstName) {
            student.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            student.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            student.age = age;
            return this;
        }

        public Builder withUniversityGroup(UniversityGroup universityGroup) {
            student.universityGroup = universityGroup;
            return this;
        }

        public Builder withEntryDate() {
            student.entryDate = new Date();
            return this;
        }

        public Builder withGrades(Set<Grade> grades) {
            student.grades = grades;
            return this;
        }

        public Student build() {
            return student;
        }
    }

}

