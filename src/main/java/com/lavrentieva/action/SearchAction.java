package com.lavrentieva.action;

import com.lavrentieva.model.Teacher;
import com.lavrentieva.model.UniversityGroup;
import com.lavrentieva.userInteraction.UserInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SearchAction implements Action {

    private final static Logger LOGGER = LogManager.getLogger(SearchAction.class);

    @Override
    public void execute() {
        String[] menu = {"Search the group", "Search the teacher"};
        final int userChoice = UserInput.menu(menu);
        String name;
        List<UniversityGroup> groups;
        List<Teacher> teachers;
        if (userChoice == 0) {
            do {
                name = UserInput.getString("Write the name of the group");
                groups = UNIVERSITY_GROUP_SERVICE.searchGroupByName(name);
            } while (groups.isEmpty());
            System.out.println(groups);
            LOGGER.info("The group was found or shown all groups");
        } else {
            do {
                name = UserInput.getString("Write the teacher's name or surname");
                teachers = TEACHER_SERVICE.searchTeacherByNameOrSurname(name);
            } while (teachers.isEmpty());
            System.out.println(teachers);
            LOGGER.info("The teacher was found or shown all teachers");
        }
    }
}
