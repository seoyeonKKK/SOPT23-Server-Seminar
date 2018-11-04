package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
    private ProfessorBuilder professorBuilder = new ProfessorBuilder();

    @Override
    public Professor getByPfIdx(final int PfIdx) {
        return professorBuilder
                .setPfIdx(PfIdx)
                .build();
    }
}

