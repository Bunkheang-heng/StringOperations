import java.util.Arrays;

public class IntegerArrayConverter {
    public static void main(String[] args) {
        // Test array of integers
        int[] intArray = {1, 2, 3, 4, 5};

        // Convert array to comma-separated string
        String intArrayString = Arrays.toString(intArray).replaceAll("\\[|\\]|\\s", "");

        // Display the comma-separated string
        System.out.println("Array as comma-separated string: " + intArrayString);

        // Convert comma-separated string back to array
        String[] intArrayFromString = intArrayString.split(",");
        int[] newArray = new int[intArrayFromString.length];
        for (int i = 0; i < intArrayFromString.length; i++) {
            newArray[i] = Integer.parseInt(intArrayFromString[i]);
        }

        // Display the converted array
        System.out.println("Array converted back from string: " + Arrays.toString(newArray));
    }
}

