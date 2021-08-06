package com.xgileIt.assignments.Student;

import com.xgileIt.assignments.Middleware.StudentsInterface;

import java.util.*;

public  class StudentRecords  implements StudentsInterface {

    Set<StudentsInfo> studentList = new HashSet<>();
    Set<CourseInformation> courseList = new HashSet<>();
    HashMap<StudentsInfo,CourseInformation> studentCourseMap = new HashMap<StudentsInfo,CourseInformation>();


    @Override
    public Set<StudentsInfo> findAllStudents() {
        return studentList;
    }

    @Override
    public void addNewStudents(StudentsInfo studentObj) {
        studentList.add(studentObj);
    }

    @Override
    public Set<CourseInformation> findAllCourse() {
        return courseList;
    }

    @Override
    public void addNewCourse(CourseInformation courseInformation) {
        courseList.add(courseInformation);
    }

    @Override
    public void registerCourse(StudentsInfo studentsInfo, CourseInformation courseInformation) {
        studentCourseMap.put(studentsInfo,courseInformation);
    }

    @Override
    public HashMap<StudentsInfo, CourseInformation> findAllRegistration() {
        return studentCourseMap;
    }

    @Override
    public List<StudentsInfo> CourseInformation(int courseId) {
        List<StudentsInfo> studentList = new ArrayList<StudentsInfo>();
        for(Map.Entry<StudentsInfo, CourseInformation> studMap : studentCourseMap.entrySet()) {
            if(studMap.getValue().courseId == courseId) {
                studentList.add(studMap.getKey());
            }
        }
        return studentList;
    }

    @Override
    public CourseInformation StudentInfo(int studentId) {
        CourseInformation courseDetails = null;
        for(Map.Entry<StudentsInfo, CourseInformation> studMap : studentCourseMap.entrySet()) {
            if(studMap.getKey().studentId == studentId) {
                courseDetails = new CourseInformation(studMap.getValue().getCourseId(), studMap.getValue().getCourseDuration(), studMap.getValue().getCourseName(), studMap.getValue().getSubject());
            }
        }
        return courseDetails;
    }

}
