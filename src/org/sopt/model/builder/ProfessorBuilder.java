package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int PfIdx;
    private String PfName;
    private String PfDepartment;
    private String PfPhoneNum;
    private String PfSubject;

    public ProfessorBuilder setPfIdx(final int PfIdx){
        this.PfIdx = PfIdx;
        return this;
    }

    public ProfessorBuilder setDepName(final String PfName){
        this.PfName = PfName;
        return this;
    }

    public ProfessorBuilder setPfDepartment(final String PfDepartNum){
        this.PfDepartment = PfDepartment;
        return this;
    }

    public ProfessorBuilder setPfPhoneNum(final String PfPhoneNum){
        this.PfPhoneNum = PfPhoneNum;
        return this;
    }

    public ProfessorBuilder setPfSubject(final String PfSubject){
        this.PfSubject = PfSubject;
        return this;
    }

    public Professor build(){
        return new Professor(this.PfIdx, this.PfName, this.PfDepartment, this.PfPhoneNum, this.PfSubject);
    }
}
