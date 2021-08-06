package com.xgileIt.assignments.Student;

import java.io.Serializable;
import java.util.Objects;

public class StudentsInfo implements Serializable {

    private static final long serialVersionUID = 456L;
    int studentId;
    String firstName;
    String lastName;
    int age;
    int mobileNumber;
    String email;
    char grade;

    public StudentsInfo(int studentId, String firstName,String lastName,int mobileNumber,String email,char grade){
        this.studentId =studentId;
        this.firstName = firstName;
        this.lastName= lastName;
        this.age= age;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.grade= grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        StudentsInfo studentsInfo = (StudentsInfo) obj;
        return (studentId == studentsInfo.studentId);
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public String toString() {
        return "StudentsInfo{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                '}';
    }
}

