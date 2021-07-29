package com.xgileIt.assignments.collage;

import java.util.Objects;

public class CollageMain  {
    public static void main(String args[]) {
        StudentService stuRecordsObj = new StudentService();
        stuRecordsObj.addNewStudent(new StudentInformation(1,"Aditya","Singh",'A'));
        stuRecordsObj.addNewStudent(new StudentInformation(2,"Shivam","Singh",'A'));
        stuRecordsObj.addNewStudent(new StudentInformation(3,"Tushar","Singh",'A'));
        stuRecordsObj.addNewStudent(new StudentInformation(4,"Vishal","Singh",'A'));
        System.out.println( stuRecordsObj.findAllStudents());
        System.out.println(stuRecordsObj.findGradeForStudent(3));
        stuRecordsObj.printStudentsByGrade();
        stuRecordsObj.deleteStudent(1);
        System.out.println( stuRecordsObj.findAllStudents());
    }
}

