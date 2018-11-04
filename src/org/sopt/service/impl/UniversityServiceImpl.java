package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {

    private UniversityBuilder universityBuilder = new UniversityBuilder();

    @Override
    public University getByUnivIdx(final int UnivIdx) {
        return universityBuilder
                .setUnivIdx(UnivIdx)
                .build();
    }
}
