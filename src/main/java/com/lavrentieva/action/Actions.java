package com.lavrentieva.action;

import lombok.Getter;

@Getter
public enum Actions {
    SEARCH("Search the group or the teacher", new SearchAction()),
    SHOW_NUMBER_BY_GROUP("Show number of students in each university group",
            new ShowNumberByGroupAction()),
    SHOW_AVERAGE_BY_GROUP("Show average grade of each university group",
            new SnowAverageByGroupAction()),
    SHOW_MIN_MAX_BY_SUBJECT("Show subjects with the lowest and the biggest average grade",
            new ShowMinMaxBySubject()),
    SHOW_BY_INPUT_GRADE("Show student's list that have higher average grade than inputted",
            new ShowStudentsByInputGrade()),
    CREATE_STUDENT("Create a new student",new CreateStudentAction()),
    EXIT("Finish the program", new ExitAction());


    private final String name;
    private final Action action;

    Actions(final String name, final Action action) {
        this.name = name;
        this.action = action;
    }

    public void execute() {
        action.execute();
    }
}
