package com.xgileIt.assignments.collage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentService implements StudentInterface {

    public static List<StudentInformation> studentsRecordsList = new ArrayList<>();
    @Override
    public List<StudentInformation> findAllStudents() {
        return studentsRecordsList;
    }
    @Override
    public void addNewStudent(StudentInformation studentObj) {
        studentsRecordsList.add(studentObj);
    }
    @Override
    public char findGradeForStudent(int id) {
        char stuGrade = 0;
        for(int i=0;i<studentsRecordsList.size();i++) {
            if(studentsRecordsList.get(i).studentId==id) {
                stuGrade = studentsRecordsList.get(i).grade;
                break;
            }
        }
        return stuGrade;
    }
    @Override
    public void printStudentsByGrade() {
        Collections.sort(studentsRecordsList);
        System.out.println(studentsRecordsList.toString());
    }
    @Override
    public List<StudentInformation> deleteStudent(int id) {
        int getIndex =0 ;
        for(int i=0;i<studentsRecordsList.size();i++)
        {
            if(studentsRecordsList.get(i).studentId==id) {
                getIndex= i;
                break;
            }
        }
        studentsRecordsList.remove(getIndex);
        return studentsRecordsList;
    }



}
