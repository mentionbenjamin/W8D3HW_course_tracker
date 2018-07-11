package models;

public class Lesson {

    private int id;
    private String title;
    private int classroomNumber;

    public Lesson(){}

    public Lesson(String title, int classroomNumber){
        this.title = title;
        this.classroomNumber = classroomNumber;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getClassroomNumber(){
        return this.classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber){
        this.classroomNumber = classroomNumber;
    }

}
