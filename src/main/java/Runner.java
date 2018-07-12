
import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course = new Course("Historic Computing", "BComp");
        DBHelper.save(course);

        Instructor instructor1 = new Instructor("John");
        DBHelper.save(instructor1);
        Instructor instructor2 = new Instructor("Jarrod");
        DBHelper.save(instructor2);

        Lesson lesson1 = new Lesson("Computer Science", 314, course, instructor1);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("History", 1066, course, instructor1);
        DBHelper.save(lesson2);

        Student student1 = new Student("Stuart", 26, 42, course);
        DBHelper.save(student1);
        Student student2 = new Student("Ben", 24, 23, course);
        DBHelper.save(student2);

        Mentor mentor = new Mentor("Zsolt", student1);
        DBHelper.save(mentor);


        List<Student> students = DBHelper.getAll(Student.class);
        List<Instructor> instructors = DBHelper.getAll(Instructor.class);


        System.exit(0);
    }
}