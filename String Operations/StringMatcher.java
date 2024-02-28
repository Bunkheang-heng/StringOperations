import java.util.Scanner;

public class StringMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String text = scanner.nextLine();

        // Input pattern
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        // Check if pattern exists in string
        boolean isMatched = isPatternMatched(text, pattern);

        if (isMatched) {
            System.out.println("Pattern exists in the string.");
        } else {
            System.out.println("Pattern does not exist in the string.");
        }

        // Example of string splitting
        System.out.print("\nEnter a string to split: ");
        String stringToSplit = scanner.nextLine();

        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();

        String[] parts = stringToSplit.split(delimiter);
        System.out.println("Splitting the string using the delimiter:");
        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }

    // Function to determine if the pattern exists in the string
    private static boolean isPatternMatched(String text, String pattern) {
        // Simple pattern matching algorithm
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == m)
                return true; // pattern found
        }
        return false; // pattern not found
    }
}
