package models;

public class Student {

    private int id;
    private String name;
    private int age;
    private int enrollmentNumber;

    public Student(){}

    public Student(String name, int age, int enrollmentNumber){
        this.name = name;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getEnrollmentNumber(){
        return this.enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber){
        this.enrollmentNumber = enrollmentNumber;
    }
}
