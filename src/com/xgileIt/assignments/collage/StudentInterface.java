package com.xgileIt.assignments.collage;
import java.util.List;

public interface StudentInterface {

    List<StudentInformation> findAllStudents();
    void addNewStudent(StudentInformation student);
    char findGradeForStudent(int studentId);
    void printStudentsByGrade();
    List<StudentInformation> deleteStudent(int id);
}
