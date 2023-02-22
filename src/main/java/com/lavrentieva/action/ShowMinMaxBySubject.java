package com.lavrentieva.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShowMinMaxBySubject implements Action {

    private final static Logger LOGGER = LogManager.getLogger(ShowMinMaxBySubject.class);

    @Override
    public void execute() {
        SUBJECT_SERVICE.minAndMaxAverageOfGradeBySubject();
        LOGGER.info("The subjects with the lowest and the biggest average grade are shown");
    }
}
