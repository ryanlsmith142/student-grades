package grades;

import java.util.ArrayList;

public class Student {

    //PRIVATE PROPERTY DECLARATIONS

    private String name;

    private ArrayList<Double> studentGrades;

    //STUDENT CONSTRUCTOR

    public Student(String name) {
        this.name = name;
        this.studentGrades =  new ArrayList<>();
    } //Student()

    public void addGrade(double Grade){
        studentGrades.add(Grade);
    }

    public void setName(String sName){
        this.name = sName;
    }

    public String getName(){
        return this.name;
    }

    public double[] studentGrades(){
        return this.studentGrades;
    }


    public static void main(String[] args) {
        Student ryan = new Student("Ryan Smith");
        ryan.addGrade(92.12);
        ryan.addGrade(87.34);
        ryan.addGrade(84.65);

        for(Student student: ryan.){

        }

        System.out.println("ryan = " + ryan);
    }


} //Student Class
