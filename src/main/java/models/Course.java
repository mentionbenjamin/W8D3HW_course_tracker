package models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    private int id;
    private String name;
    private String level;
    private List<Student> students;
    private List<Lesson> lessons;

    public Course(){}

    public Course(String name, String level){
        this.name = name;
        this.level = level;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }


    @Column(name="name")
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    @Column(name="level")
    public String getLevel(){
        return this.level;
    }
    public void setLevel(String level){
        this.level = level;
    }


    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getStudents(){
        return this.students;
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }


    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Lesson> getLessons() {
        return this.lessons;
    }
    public void setLessons(List<Lesson> lessons){
        this.lessons = lessons;
    }

}
