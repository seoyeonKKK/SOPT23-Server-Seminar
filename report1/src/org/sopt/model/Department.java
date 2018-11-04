package org.sopt.model;

public class Department extends University {
    private int DepIdx;
    private String DepName;
    private String DepPhoneNum;
    private String DepType;

    public Department(){}

    public Department(final int DepIdx, final String DepName, final String DepPhoneNum, final String DepType) {
        super();
        this.DepIdx = DepIdx;
        this.DepName = DepName;
        this.DepPhoneNum = DepPhoneNum;
        this.DepType = DepType;
    }

    public Department(final int UnivIdx, final String UnivName, final String UnivPhoneNum, final String UnivAddress, final int DepIdx, final String DepName, final String DepPhoneNum, final String DepType) {
        super(UnivIdx, UnivName, UnivPhoneNum, UnivAddress);
        this.DepIdx = DepIdx;
        this.DepName = DepName;
        this.DepPhoneNum = DepPhoneNum;
        this.DepType = DepType;
    }

    public int getDepIdx(){
        return DepIdx;
    }

    public void setDepIdx(final int DepIdx){
        this.DepIdx = DepIdx;
    }

    public String getDepName(){
        return DepName;
    }

    public void setDepName(final String DepName){
        this.DepName = DepName;
    }

    public String getDepPhoneNum(){
        return DepName;
    }

    public void setDepPhoneNum(final String DepPhoneNum){
        this.DepPhoneNum = DepPhoneNum;
    }

    public String getDepType(){
        return DepType;
    }

    public void setDepType(final String DepType){
        this.DepType = DepType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentIdx=" + DepIdx +
                ", departmentName='" + DepName + '\'' +
                ", departmentPhoneNum='" + DepPhoneNum + '\'' +
                ", departmentType='" + DepType + '\'' +
                '}';
    }

}
