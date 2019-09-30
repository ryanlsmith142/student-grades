package grades;

import java.util.ArrayList;

public class Student {

    //PRIVATE PROPERTY DECLARATIONS

    private String name;

    private ArrayList<Long> studentGrades;

    //STUDENT CONSTRUCTOR

    public Student(String name) {
        this.name = name;
        this.studentGrades =  new ArrayList<>();
    } //Student()

    public void addGrade(long Grade){
        studentGrades.add(Grade);
    }

    public void setName(String sName){
        this.name = sName;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getStudentGrades(){
        return this.studentGrades;
    }


    public long getGradeAverage(ArrayList studentGrades) {
        int studentRyan = studentGrades.size();
        long total = 0;
        for (int i = 0; i <= studentRyan - 1; i++) {
            total += (long) studentGrades.get(i);
        }
        return total / studentRyan;
    }



    public static void main(String[] args) {


//        System.out.println(total);
    }


} //Student Class
