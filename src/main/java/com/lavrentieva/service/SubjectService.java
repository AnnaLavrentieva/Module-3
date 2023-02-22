package com.lavrentieva.service;

import com.lavrentieva.model.Subject;
import com.lavrentieva.repository.SubjectRepository;

import java.util.List;

public class SubjectService {
    private static SubjectService instance;
    private final SubjectRepository subjectRepository;

    private SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public static SubjectService getInstance() {
        if (instance == null) {
            instance = new SubjectService(SubjectRepository.getInstance());
        }
        return instance;
    }

    public List<Subject> getAllInList() {
        return subjectRepository.getAllInList();
    }

    public void minAndMaxAverageOfGradeBySubject() {
        subjectRepository.minAndMaxAverageOfGradeBySubject();
    }
}
