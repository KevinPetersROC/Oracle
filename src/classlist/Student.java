package classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student
{
    static void main(String[] args)
    {
        ArrayList<String> studentNames = new ArrayList();

        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    static void addStudents(ArrayList<String> studentNames)
    {
        studentNames.add("Silvano");
        studentNames.add("Kevin");
    }

    static void displayStudents(ArrayList<String> studentNames)
    {
        for (String student : studentNames)
            System.out.println("Student Name: " + student);
    }
}
