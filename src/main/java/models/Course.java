package models;


import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course {

    private int id;
    private String name;
    private String level;

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
    public void setId(){
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

}
