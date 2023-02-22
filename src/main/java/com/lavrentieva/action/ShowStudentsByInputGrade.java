package com.lavrentieva.action;

import com.lavrentieva.userInteraction.UserInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class ShowStudentsByInputGrade implements Action {

    private final static Logger LOGGER = LogManager.getLogger(ShowStudentsByInputGrade.class);
    private static final double DEFAULT_NUMBER = 11.65;

    @Override
    public void execute() {
        String[] menu = {"Input your number", "Default number - 11.65"};
        final int userChoice = UserInput.menu(menu);
        double number;
        if (userChoice == 0) {
            number = Optional.of(UserInput.getDouble(
                            "Write your number for get student's list that have higher average grade"))
                    .filter(c -> c >= 0.00 && c <= 12.00)
                    .orElse(DEFAULT_NUMBER);
        } else {
            number = DEFAULT_NUMBER;
        }
        STUDENT_SERVICE.getStudentsWithAverageGradeBiggerThanValue(number);
        LOGGER.info("The student's list that have higher average grade than {} are shown", number);
    }
}
