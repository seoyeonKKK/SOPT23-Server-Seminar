package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder{
    private int DepIdx;
    private String DepName;
    private String DepPhoneNum;
    private String DepType;

    public DepartmentBuilder setDepIdx(final int DepIdx){
        this.DepIdx = DepIdx;
        return this;
    }

    public DepartmentBuilder setDepName(final String DepName){
        this.DepName = DepName;
        return this;
    }

    public DepartmentBuilder setDepPhoneNum(final String DepPhoneNum){
        this.DepPhoneNum = DepPhoneNum;
        return this;
    }

    public DepartmentBuilder setDepType(final String DepType){
        this.DepType = DepType;
        return this;
    }

    public Department build(){
        return new Department(this.DepIdx, this.DepName, this.DepPhoneNum, this.DepType);
    }
}
