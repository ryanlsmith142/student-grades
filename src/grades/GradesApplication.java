package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Input userInput = new Input();

        students.put("ryanlsmith142", new Student("Ryan Smith"));

        students.put("mitchellarnold", new Student("Mitchell Arnold"));

        students.put("mark3000teamplayer", new Student("Mark LeStrange"));

        students.put("izzy93codeguy", new Student("Izzy Bradshires"));

        System.out.println(students);


        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");

        for(String studentNames : students.keySet() ) {
            System.out.println(students.get(studentNames).getName());
        }

        System.out.println("Please enter a username to see their name and grade average");

        String usernameSelection = userInput.getString();

        for(String studentNames : students.keySet()) {
            if(usernameSelection.equalsIgnoreCase(students.get(studentNames).getName())) {
                System.out.println(students.get(studentNames).getGradeAverage(studentNames))
            }
        }

    }
}
