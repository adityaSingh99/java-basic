package com.xgileIt.assignments.library;

public class Student {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public boolean isSchoolDiscount() {
        return schoolDiscount;
    }

    public void setSchoolDiscount(boolean schoolDiscount) {
        this.schoolDiscount = schoolDiscount;
    }

    private String schoolId;
    boolean schoolDiscount;
}
