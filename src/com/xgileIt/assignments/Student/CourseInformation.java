package com.xgileIt.assignments.Student;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class CourseInformation implements Serializable {

    private  static  final long serialVersionUID = 1234L;
        int courseId;
        String courseName;
        int courseDuration;
        List<String> subjectName;

        public CourseInformation(int courseId,String courseName, int courseDuration,List<String>subjectName)
        {
            this.courseId= courseId;
            this.courseDuration=courseDuration;
            this.courseName= courseName;
            this.subjectName=subjectName;
        }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public List<String> getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(List<String> subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseInformation)) return false;
        CourseInformation that = (CourseInformation) o;
        return courseId == that.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    @Override
    public String toString() {
        return "CourseInformation{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                ", subjectName=" + subjectName +
                '}';
    }
}
