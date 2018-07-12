package models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instructors")
public class Instructor {

    private int id;
    private String name;
    private List<Lesson> lessons;

    public Instructor(){}

    public Instructor(String name){
        this.name = name;
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
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(mappedBy = "instructor", fetch = FetchType.LAZY)
    public List<Lesson> getLesson() {
        return this.lessons;
    }
    public void setLesson(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}