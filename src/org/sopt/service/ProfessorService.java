package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    Professor getByPfIdx(final int PfIdx);
}
