import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the words in the input string
        String reversedWords = reverseWords(input);

        // Display the output
        System.out.println("Output: " + reversedWords);

        // Close the scanner
        scanner.close();
    }

    /**
     * This method reverses the order of words in the given string.
     * 
     * @param input the input string
     * @return a string with the words in reverse order
     */
    public static String reverseWords(String input) {
        // Split the input string by spaces to get the words
        String[] words = input.split(" ");
        
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word to the StringBuilder
            reversed.append(words[i]);
            
            // Append a space if it's not the last word
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        // Convert the StringBuilder to a String and return it
        return reversed.toString();
    }
}

