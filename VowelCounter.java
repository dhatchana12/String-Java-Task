import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the number of vowels in the input string
        int vowelCount = countVowels(input);

        // Display the output
        System.out.println("Number of vowels: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    /**
     * This method counts and returns the number of vowels in the given string.
     * 
     * @param input the input string
     * @return the number of vowels in the input string
     */
    public static int countVowels(String input) {
        // Convert the input string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Define a string containing all vowels
        String vowels = "aeiou";

        // Initialize a counter for vowels
        int count = 0;

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                // Increment the counter if a vowel is found
                count++;
            }
        }

        // Return the total count of vowels
        return count;
    }
}

