import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Print the repeated characters
        printRepeatedCharacters(input);

        // Close the scanner
        scanner.close();
    }

    /**
     * This method prints the repeated characters in the given string.
     * 
     * @param input the input string
     */
    public static void printRepeatedCharacters(String input) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Otherwise, add the character to the map with count 1
                charCountMap.put(ch, 1);
            }
        }

        // Display the repeated characters
        System.out.print("Repeated characters: ");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }

        // If no repeated characters are found, print a message
        if (!found) {
            System.out.println("hello");
        }
    }
}

