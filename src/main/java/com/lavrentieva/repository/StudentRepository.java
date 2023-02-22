package com.lavrentieva.repository;

import com.lavrentieva.model.Student;
import com.lavrentieva.model.UniversityGroup;
import com.lavrentieva.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

public class StudentRepository {
    private static StudentRepository instance;

    private StudentRepository() {
    }

    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void save(final Student student) {
        Objects.requireNonNull(student);
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.flush();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void numberOfStudentsInGroup() {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = cb.createQuery(Object[].class);
        Root<Student> getterRoot = criteriaQuery.from(Student.class);
        Join<Student, UniversityGroup> groups = getterRoot.join("universityGroup");
        criteriaQuery.multiselect(groups.get("groupName"), cb.count(getterRoot));
        criteriaQuery.groupBy(groups.get("groupName"));
        final List<Object[]> resultList = entityManager.createQuery(criteriaQuery).getResultList();
        for (Object[] result : resultList) {
            System.out.println("University group " + result[0] + " has " + result[1] + " students");
        }
    }

    public void getStudentsWithAverageGradeBiggerThanValue(double number) {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        final String hql = "select s.firstName, s.lastName, avg(g.gradeValue) " +
                "from Student s join s.grades g " +
                "group by s.id " +
                "having avg(g.gradeValue) > :number";
        Query query = entityManager.createQuery(hql);
        query.setParameter("number", number);
        final List<Object[]> resultList = query.getResultList();
        DecimalFormat df = new DecimalFormat("#.00");
        for (Object[] result : resultList) {
            System.out.println("Student " + result[0] + " " + result[1] +
                    " has average grade " + df.format(result[2]));
        }
    }

}
