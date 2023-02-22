package com.lavrentieva;

import com.lavrentieva.userInteraction.UserOutput;
import com.lavrentieva.util.FlywayUtil;
import com.lavrentieva.util.HibernateUtil;
import org.flywaydb.core.Flyway;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        Flyway flyway = FlywayUtil.getFlyway();
        flyway.clean();
        final EntityManager entityManager = HibernateUtil.getEntityManager();
        flyway.migrate();
        entityManager.close();
        UserOutput userOutput = new UserOutput();
        userOutput.executeUserChoice();
    }
}
