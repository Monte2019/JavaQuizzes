package quizzes;

import java.util.ArrayList;

public class ExecutionQuiz {


    public static void main(String[] args) {
        ArrayList students = new ArrayList();
        students.add("Zuha");
        students.add("Hisham");
        students.add("Zaki");
        students.add("Wayel");

        Scanner studentName = new Scanner(System.in);
        System.out.println("Which Student are you looking for?");

        String Student = studentName.nextLine();  // Read user input

        if (Student=="Zuha")

            for (Object element: students) {
            System.out.println(element);
        }


    }

}

