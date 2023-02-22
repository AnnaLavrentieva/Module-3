package com.lavrentieva.repository;

import com.lavrentieva.model.Subject;
import com.lavrentieva.util.HibernateUtil;
import lombok.SneakyThrows;

import javax.persistence.EntityManager;
import java.text.DecimalFormat;
import java.util.List;

public class SubjectRepository {
    private static SubjectRepository instance;

    private SubjectRepository() {
    }

    public static SubjectRepository getInstance() {
        if (instance == null) {
            instance = new SubjectRepository();
        }
        return instance;
    }

    public List<Subject> getAllInList() {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        return entityManager.createQuery("from Subject", Subject.class)
                .getResultList();
    }

    @SneakyThrows
    public void minAndMaxAverageOfGradeBySubject() {
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        final String sql = "select subjects.subject_name, min_max.avg_grade from " +
                "(select subject_id, avg_grade from (" +
                "select subject_id, avg(grade_value) as avg_grade from grades " +
                "group by subject_id) gg where avg_grade in (select max(avg_grade) as max " +
                "from (select subject_id, avg(grade_value) as avg_grade from grades " +
                "group by subject_id) g) union select subject_id, avg_grade from (" +
                "select subject_id, avg(grade_value) as avg_grade from grades " +
                "group by subject_id) gg where avg_grade in (" +
                "select min(avg_grade) as min from (select subject_id, " +
                "avg(grade_value) as avg_grade from grades " +
                "group by subject_id) g) ) min_max join subjects " +
                "on min_max.subject_id = subjects.subject_id";
        final List<Object[]> resultList = entityManager.createNativeQuery(sql).getResultList();
        final DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("These are the worst and the best performing subjects: ");
        for (Object[] result : resultList) {
            System.out.println("Subject " + result[0] + " has " + df.format(result[1])
                    + " average grade");
        }
    }
}
