package com.lavrentieva.userInteraction;

import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private final static Logger LOGGER = LogManager.getLogger(UserInput.class);

    @SneakyThrows
    public static int menu(final String[] names) {
        int userChoice = -1;
        do {
            System.out.println();
            System.out.println("Please write what you want to do:");
            for (int i = 0; i < names.length; i++) {
                System.out.println(i + " " + names[i]);
            }
            LOGGER.info("User has to make a choice");
            final String line = READER.readLine();
            if (!StringUtils.isNumeric(line)) {
                LOGGER.info("The user inputted incorrect data: {}",line);
                continue;
            }
            userChoice = Integer.parseInt(line);
        } while (userChoice < 0 || userChoice >= names.length);
        System.out.println();
        return userChoice;
    }

    @SneakyThrows
    public static String getString(final String option) {
        String line;
        do {
            System.out.println(option);
            line = READER.readLine();
        } while (StringUtils.isNumeric(line));
        return line;
    }

    @SneakyThrows
    public static double getDouble(final String option) {
        String line;
        do {
            System.out.println(option);
            line = READER.readLine();
        } while (!line.matches("\\d+(\\.\\d+)?"));
        return Double.parseDouble(line);
    }

    @SneakyThrows
    public static int getInt(final String option) {
        String line;
        do {
            System.out.println(option);
            line = READER.readLine();
        } while (!StringUtils.isNumeric(line));
        return Integer.parseInt(line);
    }
}
