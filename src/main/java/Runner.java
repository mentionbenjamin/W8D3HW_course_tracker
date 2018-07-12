
import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course = new Course("Historic Computing", "BComp");
        DBHelper.save(course);

        Lesson lesson1 = new Lesson("Computer Science", 314, course);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("History", 1066, course);
        DBHelper.save(lesson2);

        Student student1 = new Student("Stuart", 26, 42, course);
        DBHelper.save(student1);
        Student student2 = new Student("Ben", 24, 23, course);
        DBHelper.save(student2);

        Mentor mentor = new Mentor("Zsolt");
        DBHelper.save(mentor);



        System.exit(0);
    }
}