package com.xgileIt.assignments.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface StudentInterface {
        Set<StudentInformation> findAllStudents();
        void addNewStudents(StudentInformation student);

        Set<CourseInformation> findAllCourse();
        void addNewCourse(CourseInformation courseDetail);

        void registerCourse(StudentInformation studentInfo, CourseInformation courseInfo);
        HashMap<StudentInformation,CourseInformation> findAllRegistration();

        List<StudentInformation> CourseInformation (int courseId);
        CourseInformation StudentInformation (int studentId);

}
