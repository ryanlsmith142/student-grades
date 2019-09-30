package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
                HashMap<String, Student> students = new HashMap<>();

                students.put("ryanlsmith142", new Student("Ryan Smith"));

                students.put("mitchellarnold", new Student("Mitchell Arnold"));

                students.put("mark3000teamplayer", new Student("Mark LeStrange"));

                students.put("izzy93codeguy", new Student("Izzy Bradshires"));

                System.out.println(students);

//                for(String key : students.keySet()) {
//                    System.out.println(students.containsKey("Izzy Bradshires"));
//                }

                students.get("izzy93codeguy").addGrade(95);
                students.get("izzy93codeguy").addGrade(42);
                students.get("izzy93codeguy").addGrade(5);

                students.get("mitchellarnold").addGrade(71);
                students.get("mitchellarnold").addGrade(35);
                students.get("mitchellarnold").addGrade(65);

                students.get("mark3000teamplayer").addGrade(65);
                students.get("mark3000teamplayer").addGrade(42);
                students.get("mark3000teamplayer").addGrade(56);

                students.get("ryanlsmith142").addGrade(100);
                students.get("ryanlsmith142").addGrade(95);
                students.get("ryanlsmith142").addGrade(75);


                System.out.println();



//                Student ryan = new Student("Ryan Smith");
//                ryan.addGrade(92);
//                ryan.addGrade(87);
//                ryan.addGrade(84);

//                Student mitchell = new Student("Mitchell");
//
//                mitchell.addGrade(100);
//                mitchell.addGrade(75);
//                mitchell.addGrade(89);

//                System.out.println(mitchell.getGradeAverage(ryan.getStudentGrades()));

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students: ");

        for(String studentNames : students.keySet() ) {
            System.out.println(students.get(studentNames).getName());

        }


    }
}
