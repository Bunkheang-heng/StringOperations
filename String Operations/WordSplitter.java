import java.util.Scanner;

public class WordSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Splitting the sentence into words
        String[] words = sentence.split("\\s+");

        // Displaying each word separately
        System.out.println("Individual words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Counting the number of words
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);

        scanner.close();
    }
}

