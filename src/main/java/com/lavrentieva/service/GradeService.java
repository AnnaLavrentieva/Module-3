package com.lavrentieva.service;

import com.lavrentieva.model.Grade;
import com.lavrentieva.model.Subject;
import com.lavrentieva.repository.GradeRepository;

import java.util.List;
import java.util.Random;

public class GradeService {

    private static GradeService instance;
    private final GradeRepository gradeRepository;
    private Random random = new Random();

    private GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public static GradeService getInstance() {
        if (instance == null) {
            instance = new GradeService(GradeRepository.getInstance());
        }
        return instance;
    }

    public Grade createRandomGrade() {
        final Subject subject = getRandomSubject();
        final Grade grade = new Grade();
        grade.setSubject(subject);
        grade.setGradeValue(random.nextInt(9, 12));
        return grade;
    }

    private Subject getRandomSubject() {
        final List<Subject> subjects = SubjectService.getInstance().getAllInList();
        final int randomNumber = random.nextInt(0, subjects.size());
        return subjects.get(randomNumber);
    }
}
