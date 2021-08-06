package com.xgileIt.assignments.Middleware;

import com.xgileIt.assignments.Student.CourseInformation;
import com.xgileIt.assignments.Student.StudentsInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface StudentsInterface {
    Set<StudentsInfo> findAllStudents();
    void addNewStudents( StudentsInfo student);

    Set<CourseInformation> findAllCourse();
    void addNewCourse(CourseInformation courseInformation);

    void registerCourse(StudentsInfo studentsInfo,CourseInformation courseInformation);
    HashMap<StudentsInfo , CourseInformation> findAllRegistration();

    List<StudentsInfo> CourseInformation (int courseId);
    CourseInformation StudentInfo (int studentId);
}
