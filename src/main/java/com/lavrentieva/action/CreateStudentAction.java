package com.lavrentieva.action;

import com.lavrentieva.model.Student;
import com.lavrentieva.userInteraction.UserInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateStudentAction implements Action {

    private final static Logger LOGGER = LogManager.getLogger(CreateStudentAction.class);

    @Override
    public void execute() {
        LOGGER.info("The process of creating new student started");
        String firstName;
        String lastName;
        int age;
        do {
            firstName = UserInput.getString("Write the first name of the student");
        } while (firstName.trim().isEmpty());
        LOGGER.info("The user inputted first name of the student: {}", firstName);
        do {
            lastName = UserInput.getString("Write the last name of the student");
        } while (lastName.trim().isEmpty());
        LOGGER.info("The user inputted last name of the student: {}", lastName);
        do {
            age = UserInput.getInt("Write the age of the student");
        } while (age < 18);
        LOGGER.info("The user inputted age of the student: {}", age);
        final Student student = STUDENT_SERVICE.createRandomStudent(firstName, lastName, age);
        LOGGER.info("The student was created and saved in repository");
        System.out.println("The student was created: " + student);
    }
}
