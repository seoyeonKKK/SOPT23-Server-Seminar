package org.sopt.service;

import org.sopt.model.Student;

public interface StudentService {
    Student getByStdIdx(final int StdIdx);
}
