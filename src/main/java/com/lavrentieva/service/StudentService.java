package com.lavrentieva.service;

import com.lavrentieva.model.Grade;
import com.lavrentieva.model.Student;
import com.lavrentieva.model.UniversityGroup;
import com.lavrentieva.repository.StudentRepository;

import java.util.*;

public class StudentService {
    private static StudentService instance;
    private final StudentRepository studentRepository;

    private Random random = new Random();

    private StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static StudentService getInstance() {
        if (instance == null) {
            instance = new StudentService(StudentRepository.getInstance());
        }
        return instance;
    }

    public Student createRandomStudent(String firstName, String lastName, int age) {
        Objects.requireNonNullElse(firstName,"John");
        Objects.requireNonNullElse(lastName,"Doe");
        Objects.requireNonNullElse(lastName,20);
        final Student student = new Student.Builder()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAge(age)
                .withEntryDate()
                .withUniversityGroup(getRandomUniversityGroup())
                .withGrades(generateSetRandomGrades())
                .build();
        studentRepository.save(student);
        return student;
    }

    private UniversityGroup getRandomUniversityGroup() {
        final List<UniversityGroup> groups = UniversityGroupService.getInstance().getAllInList();
        final int randomNumber = random.nextInt(0, groups.size());
        return groups.get(randomNumber);
    }

    private Set<Grade> generateSetRandomGrades() {
        final Set<Grade> grades = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            final Grade grade = GradeService.getInstance().createRandomGrade();
            grades.add(grade);
        }
        return grades;
    }

    public void numberOfStudentsInGroup() {
        studentRepository.numberOfStudentsInGroup();
    }

    public void getStudentsWithAverageGradeBiggerThanValue(double number) {
        studentRepository.getStudentsWithAverageGradeBiggerThanValue(number);
    }

}
