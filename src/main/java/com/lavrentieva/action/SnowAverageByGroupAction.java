package com.lavrentieva.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SnowAverageByGroupAction implements Action{

    private final static Logger LOGGER = LogManager.getLogger(SnowAverageByGroupAction.class);

    @Override
    public void execute() {
        UNIVERSITY_GROUP_SERVICE.averageGradeByGroup();
        LOGGER.info("The average grade of each university group are shown");
    }
}
