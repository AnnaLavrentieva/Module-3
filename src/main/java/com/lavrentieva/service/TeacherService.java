package com.lavrentieva.service;

import com.lavrentieva.model.Teacher;
import com.lavrentieva.repository.TeacherRepository;

import java.util.List;
import java.util.Objects;

public class TeacherService {
    private static TeacherService instance;
    private final TeacherRepository teacherRepository;

    private TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public static TeacherService getInstance() {
        if (instance == null) {
            instance = new TeacherService(TeacherRepository.getInstance());
        }
        return instance;
    }

    public List<Teacher> searchTeacherByNameOrSurname(final String name) {
        Objects.requireNonNull(name);
        final List<Teacher> teachers = teacherRepository.searchTeacherByNameOrSurname(name);
        if (teachers.isEmpty()) {
            System.out.println("There are not teacher with inputted name");
            return getAll();
        }
        return teachers;
    }

    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

}
