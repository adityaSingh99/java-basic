package com.xgileIt.assignments.Student;

import java.io.Serializable;
import java.util.Objects;

public class StudentInformation implements Serializable {

    private static final long serialVersionUID = 123L;

    int studentId ;
    String firstName;
    String lastName;
    int age;
    int mobileNO;
    String email;
    char gender;
    char grade;



    public StudentInformation(int studentId, String firstName, String lastName, int age, String email, int mobileNO, char gender){
        super();
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
        this.mobileNO= mobileNO;
        this.gender= gender;
        this.email= email;
        this.grade=grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(int mobileNO) {
        this.mobileNO = mobileNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentInformation)) return false;
        StudentInformation that = (StudentInformation) o;
        return getStudentId() == that.getStudentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId());
    }

    @Override
    public String toString() {
        return "StudentInformation{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mobileNO=" + mobileNO +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

