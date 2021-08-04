/* package com.xgileIt.assignments.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentRecord implements StudentInterface{

    Set<StudentInformation> studentList = new HashSet<>();
    Set<CourseInformation> courseList = new HashSet<>();
    HashMap<StudentInformation,CourseInformation> studentCourse = new HashMap<StudentInformation, CourseInformation>();

    @Override
    public Set<StudentInformation> findAllStudents() {
        return studentList;
    }

    @Override
    public void addNewStudents(StudentInformation studentObj) { ;
        studentList.add(studentObj);
    }

    @Override
    public Set<CourseInformation> findAllCourse() {
            return courseList;
    }

    @Override
    public void addNewCourse(CourseInformation courseDetail) {
            courseList.add(courseDetail);
    }

    @Override
    public void registerCourse(StudentInformation studentInfo, CourseInformation courseInfo) {
            studentCourseMap.put(studentInfo,courseInfo);
    }

    @Override
    public HashMap<StudentInformation, CourseInformation> findAllRegistration() {
        return null;
    }

    @Override
    public List<StudentInformation> CourseInformation(int courseId) {
        return null;
    }

    @Override
    public CourseInformation StudentInformation(int studentId) {
        return null;
    }

}*/
