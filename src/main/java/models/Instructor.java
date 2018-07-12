package models;


import javax.persistence.*;

@Entity
@Table(name = "instructors")
public class Instructor {

    private int id;
    private String name;
    private Lesson lesson;

    public Instructor(){}

    public Instructor(String name, Lesson lesson){
        this.name = name;
        this.lesson = lesson;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Lesson getLesson() {
        return lesson;
    }
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
