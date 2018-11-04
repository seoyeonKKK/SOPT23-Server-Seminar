package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentBuilder studentBuilder = new StudentBuilder();

    @Override
    public Student getByStdIdx(final int StdIdx) {
        return studentBuilder
                .setStdIdx(StdIdx)
                .build();
    }
}
