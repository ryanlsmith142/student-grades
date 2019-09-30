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


    public long getGradeAverage(ArrayList studentGrade) {
        int studentRyan = ryan.getStudentGrades().size();
        long total = 0;
        for (int i = 0; i <= studentRyan - 1; i++) {
            total += (long) ryan.getStudentGrades().get(i);
        }
        return total /= studentRyan;
    }
        System.out.println(total);


    public static void main(String[] args) {
        Student ryan = new Student("Ryan Smith");
        ryan.addGrade(92);
        ryan.addGrade(87);
        ryan.addGrade(84);






//        System.out.println(total);
    }


} //Student Class
