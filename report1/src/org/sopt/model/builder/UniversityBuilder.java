package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int UnivIdx;
    private String UnivName;
    private String UnivPhoneNum;
    private String UnivAddress;

    public UniversityBuilder setUnivIdx(final int UnivIdx){
        this.UnivIdx = UnivIdx;
        return this;
    }

    public UniversityBuilder setUnivName(final String UnivName){
        this.UnivName = UnivName;
        return this;
    }

    public UniversityBuilder setUnivPhoneNum(final String UnivPhoneNum){
        this.UnivPhoneNum = UnivPhoneNum;
        return this;
    }

    public UniversityBuilder setUnivAddress(final String UnivAddress){
        this.UnivAddress = UnivAddress;
        return this;
    }

    public University build(){
        return new University(this.UnivIdx, this.UnivName, this.UnivPhoneNum, this.UnivAddress);
    }
}
