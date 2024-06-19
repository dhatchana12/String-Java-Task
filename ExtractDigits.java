public class ExtractDigits {
    public static void main(String[] args) {
        String input = "75#41*";
        String output = extractDigits(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String extractDigits(String str) {
        StringBuilder digits = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        return digits.toString();
    }
}