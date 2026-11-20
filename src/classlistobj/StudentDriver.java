package classlistobj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver
{
    static void main(String[] args)
    {
        ArrayList<Student> studentNames = new ArrayList<Student>();

        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    static void displayStudents(ArrayList<Student> studentNames)
    {
        for(Student student : studentNames)
        {
            System.out.println(student);
        }
    }

    static void addStudents(ArrayList<Student> studentNames)
    {
        studentNames.add(new Student("Kevin", "Peters", 20));
        studentNames.add(new Student("Silvano", "Mohabir", 65));
        studentNames.add(new Student("Gerard", "Joling", 10));

    }
}
