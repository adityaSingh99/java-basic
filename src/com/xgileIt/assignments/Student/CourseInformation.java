package com.xgileIt.assignments.Student;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class CourseInformation  implements Serializable {

    private static final long serialVersionUID = 123l;
    int courseId;
    int courseDuration;
    String courseName;
    List<String> subject;

    public CourseInformation(int courseId ,int courseDuration, String courseName ,List<String>subject)
    {
        this.courseId = courseId;
        this.courseDuration = courseDuration;
        this.courseName = courseName;
        this.subject = subject;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object object1) {
        CourseInformation courseInformation = (CourseInformation) object1;
        return (courseId == courseInformation.courseId);
    }

    @Override
    public int hashCode() {
        return courseId;
    }

    @Override
    public String toString() {
        return "CourseInformation{" +
                "courseId=" + courseId +
                ", courseDuration=" + courseDuration +
                ", courseName='" + courseName + '\'' +
                ", subject=" + subject +
                '}';
    }
}
