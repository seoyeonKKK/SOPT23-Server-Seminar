package org.sopt.model;

public class Professor extends Department{
    private int PfIdx;
    private String PfName;
    private String PfDepartment;
    private String PfPhoneNum;
    private String PfSubject;

    public Professor(){}

    public Professor(final int PfIdx, final String PfName, final String PfDepartment, final String PfPhoneNum, final String PfSubject) {
        super();
        this.PfIdx = PfIdx;
        this.PfName = PfName;
        this.PfDepartment = PfDepartment;
        this.PfPhoneNum = PfPhoneNum;
        this.PfSubject = PfSubject;
    }

    public Professor(final int UnivIdx, final String UnivName, final String UnivPhoneNum, final String UnivAddress, final int DepIdx, final String DepName, final String DepPhoneNum, final String DepType, final int PfIdx, final String PfName, final String PfDepartment, final String PfPhoneNum, final String PfSubject) {
        super(UnivIdx, UnivName, UnivPhoneNum, UnivAddress, DepIdx, DepName, DepPhoneNum, DepType);
        this.PfIdx = PfIdx;
        this.PfName = PfName;
        this.PfDepartment = PfDepartment;
        this.PfPhoneNum = PfPhoneNum;
        this.PfSubject = PfSubject;
    }

    public int getPfIdx() {
        return PfIdx;
    }

    public void setPfIdx(final int PfIdx) {
        this.PfIdx = PfIdx;
    }

    public String getPfName() {
        return PfName;
    }

    public void setPfName(final String PfName) {
        this.PfName = PfName;
    }

    public String getPfDepartment() {
        return PfDepartment;
    }

    public void setPfDepartment(final String PfDepartment) {
        this.PfDepartment = PfDepartment;
    }

    public String getPfPhoneNum() {
        return PfPhoneNum;
    }

    public void setPfPhoneNum(final String PfPhoneNum) {
        this.PfPhoneNum = PfPhoneNum;
    }

    public String getPfSubject() {
        return PfSubject;
    }

    public void setPfSubject(final String PfSubject) {
        this.PfSubject = PfSubject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorIdx=" + PfIdx +
                ", professorName='" + PfName + '\'' +
                ", professorDepartment='" + PfDepartment + '\'' +
                ", professorPhone='" + PfPhoneNum + '\'' +
                ", professorSubject='" + PfSubject + '\'' +
                '}';
    }
}
