package models;

public class Course {

    private int id;
    private String name;
    private String level;

    public Course(){}

    public Course(String name, String level){
        this.name = name;
        this.level = level;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLevel(){
        return this.level;
    }

    public void setLevel(String level){
        this.level = level;
    }

}
