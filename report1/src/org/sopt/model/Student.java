package org.sopt.model;

public class Student extends Department {
    private int StdIdx;
    private String StdName;
    private int StdGrade;
    private String StdDepartment;
    private String StdEmail;
    private String StdAddress;
    private int StdAge;
    private String StdState;

    public Student(){}

    public Student(final int StdIdx, final String StdName, final int StdGrade, final String StdDepartment, final String StdEmail, final String StdAddress, final int StdAge, final String StdState) {
        super();
        this.StdIdx = StdIdx;
        this.StdName = StdName;
        this.StdGrade = StdGrade;
        this.StdDepartment = StdDepartment;
        this.StdEmail = StdEmail;
        this.StdAddress = StdAddress;
        this.StdAge = StdAge;
        this.StdState = StdState;
    }

    public Student(final int UnivIdx, final String UnivName, final String UnivPhoneNum, final String UnivAddress, final int DepIdx, final String DepName, final String DepPhoneNum, final String DepType, final int StdIdx, final String StdName,  final int StdGrade, final String StdDepartment, final String StdEmail, final String StdAddress, final int StdAge,  final String StdState) {
        super(UnivIdx, UnivName, UnivPhoneNum, UnivAddress, DepIdx, DepName, DepPhoneNum, DepType);
        this.StdIdx = StdIdx;
        this.StdName = StdName;
        this.StdGrade = StdGrade;
        this.StdDepartment = StdDepartment;
        this.StdEmail = StdEmail;
        this.StdAddress = StdAddress;
        this.StdAge = StdAge;
        this.StdState = StdState;
    }

    public int getStdIdx() {
        return StdIdx;
    }

    public void setStdIdx(final int StdIdx) {
        this.StdIdx = StdIdx;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(final String StdName) {
        this.StdName = StdName;
    }

    public int getStdGrade() {
        return StdGrade;
    }

    public void setStdGrade(final int StdGrade) {
        this.StdGrade = StdGrade;
    }

    public String getStdDepartment() {
        return StdDepartment;
    }

    public void setStdDepartment(final String StdDepartment) {
        this.StdDepartment = StdDepartment;
    }

    public String getStdEmail() {
        return StdEmail;
    }

    public void setStdEmail(final String StdEmail) {
        this.StdEmail = StdEmail;
    }

    public String getStdAddress() {
        return StdAddress;
    }

    public void setStdAddress(final String StdAddress) {
        this.StdAddress = StdAddress;
    }

    public int getStdAge() {
        return StdAge;
    }

    public void setStdAge(final int StdAge) {
        this.StdAge = StdAge;
    }

    public String getStdState() {
        return StdState;
    }

    public void setStdState(final String StdState) {
        this.StdState = StdState;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentIdx=" + StdIdx +
                ", studentName='" + StdName + '\'' +
                ", studentGrade=" + StdGrade +
                ", studentDepartment=" + StdDepartment +
                ", studentEmail='" + StdEmail + '\'' +
                ", studentAddress='" + StdAddress + '\'' +
                ", studentAge=" + StdAge +
                ", studentState='" + StdState + '\'' +
                '}';
    }
}
