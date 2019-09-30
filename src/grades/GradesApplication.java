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

                for(String key : students.keySet()) {
                    System.out.println(students.containsKey("Izzy Bradshires"));
                }
    }
}
