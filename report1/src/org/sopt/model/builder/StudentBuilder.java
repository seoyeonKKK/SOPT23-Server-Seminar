package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder{
    private int StdIdx;
    private String StdName;
    private int StdGrade;
    private String StdDepartment;
    private String StdEmail;
    private String StdAddress;
    private int StdAge;
    private String StdState;


    public StudentBuilder setStdIdx(final int StdIdx){
        this.StdIdx = StdIdx;
        return this;
    }

    public StudentBuilder setStdName(final String StdName){
        this.StdName = StdName;
        return this;
    }

    public StudentBuilder setStdGrade(final int StdGrade){
        this.StdGrade = StdGrade;
        return this;
    }

    public StudentBuilder setStdDepartment(final String StdDepartment){
        this.StdDepartment = StdDepartment;
        return this;
    }

    public StudentBuilder setStdEmail(final String StdEmail){
        this.StdEmail = StdEmail;
        return this;
    }

    public StudentBuilder setStdAddress(final String StdAddress){
        this.StdAddress = StdAddress;
        return this;
    }

    public StudentBuilder setStdAge(final int StdAge){
        this.StdAge = StdAge;
        return this;
    }

    public StudentBuilder setStdState(final String StdState){
        this.StdState = StdState;
        return this;
    }

    public Student build(){
        return new Student(this.StdIdx, this.StdName, this.StdGrade, this.StdDepartment, this.StdEmail, this.StdAddress, this.StdAge, this.StdState);
    }
}
