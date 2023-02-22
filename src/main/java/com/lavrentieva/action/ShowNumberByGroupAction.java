package com.lavrentieva.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShowNumberByGroupAction implements Action {
    private final static Logger LOGGER = LogManager.getLogger(ShowNumberByGroupAction.class);

    @Override
    public void execute() {
        STUDENT_SERVICE.numberOfStudentsInGroup();
        LOGGER.info("The number of students in each university group are shown");
    }
}
