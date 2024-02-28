import java.util.Scanner;

public class StudentScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input comma-separated string containing student names and scores
        System.out.print("Enter student names and scores separated by commas (e.g., John,85;Alice,92;Bob,78): ");
        String input = scanner.nextLine();

        // Splitting the input string by semicolons to separate students
        String[] students = input.split(";");

        int totalScore = 0;
        int numStudents = students.length;

        // Iterating through each student
        for (String student : students) {
            // Splitting each student's name and score by comma
            String[] parts = student.split(",");
            String name = parts[0];
            int score = Integer.parseInt(parts[1]);

            // Adding the score to total score
            totalScore += score;

            // Displaying student's name and score
            System.out.println("Student: " + name + ", Score: " + score);
        }

        // Calculating the average score
        double averageScore = (double) totalScore / numStudents;

        // Displaying the average score
        System.out.println("Average score: " + averageScore);

        scanner.close();
    }
}

