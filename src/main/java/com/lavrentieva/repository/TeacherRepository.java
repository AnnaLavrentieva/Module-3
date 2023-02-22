package com.lavrentieva.repository;

import com.lavrentieva.model.Teacher;
import com.lavrentieva.util.HibernateUtil;
import lombok.SneakyThrows;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Objects;

public class TeacherRepository {
    private static TeacherRepository instance;

    private TeacherRepository() {
    }

    public static TeacherRepository getInstance() {
        if (instance == null) {
            instance = new TeacherRepository();
        }
        return instance;
    }

    @SneakyThrows
    public List<Teacher> searchTeacherByNameOrSurname(final String name) {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Teacher> criteriaQuery =
                cb.createQuery(Teacher.class);
        Root<Teacher> getterRoot = criteriaQuery.from(Teacher.class);
        criteriaQuery.select(getterRoot);
        Predicate condition1 = cb.equal(cb.
                lower(getterRoot.get("firstName")),name.toLowerCase());
        Predicate condition2 = cb.equal(cb.
                lower(getterRoot.get("lastName")),name.toLowerCase());
        criteriaQuery.where(cb.or(condition1,condition2));
        return entityManager.createQuery(criteriaQuery)
                .getResultList();
    }

    public List<Teacher> getAll() {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        return entityManager.createQuery("from Teacher", Teacher.class)
                .getResultList();
    }
}
