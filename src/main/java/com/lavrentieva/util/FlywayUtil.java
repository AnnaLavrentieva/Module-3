package com.lavrentieva.util;

import org.flywaydb.core.Flyway;

public class FlywayUtil {

    private FlywayUtil() {
    }

    public static Flyway getFlyway() {
        return Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/module",
                        "postgres", "root")
                .baselineOnMigrate(true)
                .locations("db/migration")
                .load();
    }
}
