package com.lavrentieva.service;

import com.lavrentieva.model.UniversityGroup;
import com.lavrentieva.repository.UniversityGroupRepository;

import java.util.List;
import java.util.Objects;

public class UniversityGroupService {
    private static UniversityGroupService instance;
    private final UniversityGroupRepository universityGroupRepository;

    private UniversityGroupService(UniversityGroupRepository universityGroupRepository) {
        this.universityGroupRepository = universityGroupRepository;
    }

    public static UniversityGroupService getInstance() {
        if (instance == null) {
            instance = new UniversityGroupService(UniversityGroupRepository.getInstance());
        }
        return instance;
    }

    public List<UniversityGroup> getAllInList() {
        return universityGroupRepository.getAllInList();
    }

    public List<UniversityGroup> searchGroupByName(final String name) {
        Objects.requireNonNull(name);
        final List<UniversityGroup> groups = universityGroupRepository.searchGroupByName(name);
        if (groups.isEmpty()) {
            System.out.println("There are not university group with inputted name");
            return getAllInList();
        }
        return groups;
    }

    public void averageGradeByGroup() {
        universityGroupRepository.averageGradeByGroup();
    }
}
