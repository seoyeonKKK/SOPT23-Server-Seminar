package org.sopt.model;

public class University {
    private int UnivIdx;
    private String UnivName;
    private String UnivPhoneNum;
    private String UnivAddress;

    public University(final int UnivIdx, final String UnivName, final String UnivPhoneNum, final String UnivAddress) {
        this.UnivIdx = UnivIdx;
        this.UnivName = UnivName;
        this.UnivPhoneNum = UnivPhoneNum;
        this.UnivAddress = UnivAddress;
    }

    public University() {}

    public int getUnivIdx() {
        return UnivIdx;
    }

    public void setUnivIdx(final int UnivIdx) {
        this.UnivIdx = UnivIdx;
    }

    public String getUnivName() {
        return UnivName;
    }

    public void setUnivName(final String UnivName) {
        this.UnivName = UnivName;
    }

    public String getUnivPhoneNum() {
        return UnivPhoneNum;
    }

    public void setUnivPhoneNum(final String UnivPhoneNum) {
        this.UnivPhoneNum = UnivPhoneNum;
    }

    public String getUnivAddress() {
        return UnivAddress;
    }

    public void setUnivAddress(final String UnivAddress) {
        this.UnivAddress = UnivAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityIdx=" + UnivIdx +
                ", universityName='" + UnivName + '\'' +
                ", universityPhone='" + UnivPhoneNum + '\'' +
                ", universityAddress='" + UnivAddress + '\'' +
                '}';
    }
}

