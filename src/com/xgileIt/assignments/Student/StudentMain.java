package com.xgileIt.assignments.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StudentMain {


    public static void main(String[] args) throws Exception {

        FileWriter fileWriter = new FileWriter("C:\\Users\\aditya singh\\dev\\java-basic\\src\\com\\xgileIt\\assignments\\Student\\StudentMain.txt");
        BufferedWriter bufferWriter= new BufferedWriter(fileWriter);
        StudentRecords studentRecords = new StudentRecords();

        StudentsInfo student1 = new StudentsInfo(1,"Aditya","Singh",700047114,"adi2singh@gmail.com",'C');
        studentRecords.addNewStudents(student1);
        StudentsInfo student2 = new StudentsInfo(2,"Abhijeet","Singh",12345678,"abji123@abc",'A');
        studentRecords.addNewStudents(student2);
        StudentsInfo student3 = new StudentsInfo(3,"Vishal","singh",741852963,"vishal@abc",'A');
        studentRecords.addNewStudents(student3);
        StudentsInfo student4 = new StudentsInfo(4,"Shivam","singh",852933789,"shivam@abc",'A');
        studentRecords.addNewStudents(student4);
        StudentsInfo student5 = new StudentsInfo(5,"Tushar","singh",789123456,"tushar@abc",'A');
        studentRecords.addNewStudents(student5);

        CourseInformation course1 = new CourseInformation(1,2,"MCA",new ArrayList<>(Arrays.asList("JAvA")));
        studentRecords.addNewCourse(course1);
        CourseInformation course2 = new CourseInformation(2,2,"MBA",new ArrayList<>(Arrays.asList("Managemet")));
        studentRecords.addNewCourse(course2);
        CourseInformation course3 = new CourseInformation(3,3,"B.com",new ArrayList<>(Arrays.asList("Charts"))) ;
        studentRecords.addNewCourse(course3);
        CourseInformation course4 = new CourseInformation(4,3,"BBA",new ArrayList<>(Arrays.asList("commerce")));
        studentRecords.addNewCourse(course4);
        CourseInformation course5 = new CourseInformation(5,5,"MBBS",new ArrayList<>(Arrays.asList("BIOLOGY")));
        studentRecords.addNewCourse(course5);

        studentRecords.registerCourse(student1,course1);
        studentRecords.registerCourse(student2,course2);
        studentRecords.registerCourse(student3,course3);
        studentRecords.registerCourse(student4,course4);
        studentRecords.registerCourse(student5,course5);

        bufferWriter.write("To print all Student Details:" +"\n");
        Iterator it = studentRecords.findAllStudents().iterator();
        while(it.hasNext()) {
            bufferWriter.write(it.next().toString());
            bufferWriter.newLine();
        }
        bufferWriter.write("\n"+"To print all Course Details:" +"\n");
        Iterator  it1 = studentRecords.findAllCourse().iterator();
        while(it1.hasNext()) {
            bufferWriter.write(it1.next().toString());
            bufferWriter.newLine();
        }

        bufferWriter.write("\n"+"To print all Registartion Details:" +"\n");
        bufferWriter.write(studentRecords.findAllRegistration().toString());

        bufferWriter.write("\n"+"To print id 001 Course Details:" +"\n");
        Iterator<?> it3 = studentRecords.CourseInformation(1).iterator();
        while(it3.hasNext()) {
            bufferWriter.write(it3.next().toString());
            bufferWriter.newLine();
        }
        bufferWriter.write("\n"+"To print id 005 Course Details:" +"\n");
        Iterator<?> it4 = studentRecords.CourseInformation(2).iterator();
        while(it4.hasNext()) {
            bufferWriter.write(it4.next().toString());
            bufferWriter.newLine();
        }

        bufferWriter.write("\n"+"To print id 1 & 3 Student Details:" +"\n");
        bufferWriter.write( studentRecords.StudentInfo(1).toString());
        bufferWriter.write(studentRecords.StudentInfo(3).toString());
        bufferWriter.flush();
        bufferWriter.close();
    }
}

