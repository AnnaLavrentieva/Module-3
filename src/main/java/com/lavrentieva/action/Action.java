package com.lavrentieva.action;

import com.lavrentieva.service.*;

public interface Action {
    StudentService STUDENT_SERVICE = StudentService.getInstance();
    SubjectService SUBJECT_SERVICE = SubjectService.getInstance();

    TeacherService TEACHER_SERVICE = TeacherService.getInstance();
    UniversityGroupService UNIVERSITY_GROUP_SERVICE = UniversityGroupService.getInstance();

    void execute();
}
