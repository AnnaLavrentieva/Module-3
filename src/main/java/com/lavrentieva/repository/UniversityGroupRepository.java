package com.lavrentieva.repository;

import com.lavrentieva.model.Grade;
import com.lavrentieva.model.Student;
import com.lavrentieva.util.HibernateUtil;
import com.lavrentieva.model.UniversityGroup;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.text.DecimalFormat;
import java.util.List;


public class UniversityGroupRepository {
    private static UniversityGroupRepository instance;

    private UniversityGroupRepository() {
    }

    public static UniversityGroupRepository getInstance() {
        if (instance == null) {
            instance = new UniversityGroupRepository();
        }
        return instance;
    }

    public List<UniversityGroup> getAllInList() {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        return entityManager.createQuery("from UniversityGroup", UniversityGroup.class)
                .getResultList();
    }

    public List<UniversityGroup> searchGroupByName(final String name) {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<UniversityGroup> criteriaQuery =
                cb.createQuery(UniversityGroup.class);
        Root<UniversityGroup> getterRoot = criteriaQuery.from(UniversityGroup.class);
        criteriaQuery.select(getterRoot);
        Predicate condition = cb.like(cb.
                lower(getterRoot.get("groupName")), name.toLowerCase() + "%");
        criteriaQuery.where(condition);
        return entityManager.createQuery(criteriaQuery)
                .getResultList();
    }

    public void averageGradeByGroup() {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = cb.createQuery(Object[].class);
        Root<UniversityGroup> groups = criteriaQuery.from(UniversityGroup.class);
        Join<UniversityGroup, Student> students = groups.join("students");
        Join<Student, Grade> grades = students.join("grades");
        criteriaQuery.multiselect(groups.get("groupName"), cb.avg(grades.get("gradeValue")));
        criteriaQuery.groupBy(groups.get("groupName"));
        final List<Object[]> resultList = entityManager.createQuery(criteriaQuery).getResultList();
        final DecimalFormat df = new DecimalFormat("#.00");
        for (Object[] result : resultList) {
            System.out.println("University group " + result[0] + " has " + df.format(result[1]) +
                    " average grade");
        }
    }

}