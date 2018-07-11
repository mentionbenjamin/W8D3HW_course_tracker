package models;


import javax.persistence.*;

@Entity
@Table(name="lessons")
public class Lesson {

    private int id;
    private String title;
    private int classroomNumber;

    public Lesson(){}

    public Lesson(String title, int classroomNumber){
        this.title = title;
        this.classroomNumber = classroomNumber;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId(){
        return this.id;
    }
    public void setId(){
        this.id = id;
    }


    @Column(name="title")
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }


    @Column(name="classroom_number")
    public int getClassroomNumber(){
        return this.classroomNumber;
    }
    public void setClassroomNumber(int classroomNumber){
        this.classroomNumber = classroomNumber;
    }

}
