package activity4;

import java.util.Scanner;
import java.util.ArrayList;

public class Activity4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Add student name");
            System.out.println("2. Search student");
            System.out.println("3. Peek available students");
            System.out.println("4. Fail student");
            System.out.println("5. Exit");
            System.out.print("Choose 1-5: ");

            int multipleChoice = input.nextInt();
            input.nextLine(); 

            if (multipleChoice == 1) {

                System.out.print("Enter student name: ");
                String name = input.nextLine();

                students.add(name);
                System.out.println("Student added!");

            } else if (multipleChoice == 2) {

                System.out.print("Search student: ");
                String searchStudent = input.nextLine();

                if (students.contains(searchStudent)) {
                    System.out.println("Student is part of the class!");
                } else {
                    System.out.println("Doesn't exist, Check attendance again sir.");
                }

            } else if (multipleChoice == 3) {

                System.out.println("Total students:");

                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }

            } else if (multipleChoice == 4) {

                System.out.print("Enter student to fail: ");
                String fail = input.nextLine();

                if (students.contains(fail)) {
                    students.remove(fail);
                    System.out.println("Student removed.");
                } else {
                    System.out.println("Student doesn't exist.");
                }

            } else if (multipleChoice == 5) {

                System.out.println("\nKA PASS NAKO SIR?");
                break;

            } else {

                System.out.println("Invalid choice");
            }
        }

        input.close();
    }
}
