package com.lavrentieva.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExitAction implements Action {

    private final static Logger LOGGER = LogManager.getLogger(ExitAction.class);

    @Override
    public void execute() {
        System.out.println("Goodbye!");
        LOGGER.info("The program finished");
        System.exit(0);
    }
}
