package models;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private int id;
    private String name;
    private int age;
    private int enrollmentNumber;
    private Course course;
    private Mentor mentor;

    public Student(){}

    public Student(String name, int age, int enrollmentNumber, Course course){
        this.name = name;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
        this.course = course;
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


    @Column(name="age")
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }


    @Column(name="enrollment_number")
    public int getEnrollmentNumber(){
        return this.enrollmentNumber;
    }
    public void setEnrollmentNumber(int enrollmentNumber){
        this.enrollmentNumber = enrollmentNumber;
    }


    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse(){
        return course;
    }
    public void setCourse(Course course){
        this.course = course;
    }


    @OneToOne(mappedBy = "student", fetch = FetchType.LAZY)
    public Mentor getMentor(){
        return this.mentor;
    }
    public void setMentor(Mentor mentor){
        this.mentor = mentor;
    }
}
