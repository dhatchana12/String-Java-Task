import java.util.Scanner;

public class RemoveFirstLastCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove the first and last characters of the input string
        String result = removeFirstLastCharacter(input);

        // Display the output
        System.out.println("Output: " + result);

        // Close the scanner
        scanner.close();
    }

    /**
     * This method removes the first and last characters of the given string.
     * 
     * @param input the input string
     * @return a string with the first and last characters removed
     */
    public static String removeFirstLastCharacter(String input) {
        // Check if the input string is null or has a length less than 2
        if (input == null || input.length() < 2) {
            return "";
        }

        // Return the substring excluding the first and last characters
        return input.substring(1, input.length() - 1);
    }
}
