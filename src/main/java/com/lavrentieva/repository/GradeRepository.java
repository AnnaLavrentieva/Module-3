package com.lavrentieva.repository;

import com.lavrentieva.model.Grade;
import com.lavrentieva.model.Student;
import com.lavrentieva.model.Subject;
import com.lavrentieva.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Random;

public class GradeRepository {
    private static GradeRepository instance;

    private GradeRepository() {
    }

    public static GradeRepository getInstance() {
        if (instance == null) {
            instance = new GradeRepository();
        }
        return instance;
    }

}
