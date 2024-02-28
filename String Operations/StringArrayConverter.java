import java.util.Arrays;

public class StringArrayConverter {
    public static void main(String[] args) {
        // Test array of strings
        String[] stringArray = {"apple", "banana", "cherry", "date"};

        // Convert array to single string representation
        String stringArrayString = String.join(",", stringArray);

        // Display the single string representation
        System.out.println("Array as single string: " + stringArrayString);

        // Convert single string back to array
        String[] newArray = stringArrayString.split(",");

        // Display the converted array
        System.out.println("Array converted back from string: " + Arrays.toString(newArray));
    }
}
