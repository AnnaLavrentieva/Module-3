package com.lavrentieva.userInteraction;

import com.lavrentieva.action.Actions;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class UserOutput {
    private final static Logger LOGGER = LogManager.getLogger(UserOutput.class);

    public UserOutput() {
        LOGGER.info("The program started");
    }

    @SneakyThrows
    public void executeUserChoice() {
        final Actions[] values = Actions.values();
        final String[] names = mapActionToName(values);
        while (true) {
            final int userChoice = UserInput.menu(names);
            LOGGER.info("The user made next choice: {}", userChoice);
            values[userChoice].execute();
        }
    }

    private static String[] mapActionToName(Actions[] values) {
        String[] names = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            names[i] = values[i].getName();
        }
        return names;
    }

}
