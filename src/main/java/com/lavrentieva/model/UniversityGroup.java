package com.lavrentieva.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "university_groups")
@Getter
@Setter
public class UniversityGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "university_group_id")
    private String id;

    @Column(name = "group_name")
    private String groupName;

    @OneToMany(mappedBy = "universityGroup", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Student> students;

    public UniversityGroup() {
    }

    @Override
    public String toString() {
        return String.format("University group:{%s, %s}", groupName, id);
    }
}
