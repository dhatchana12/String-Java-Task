public class ConvertStringCase {
    public static void main(String[] args) {
        String input = "Hello World!";
        String upperCaseOutput = toUpperCaseManual(input);
        String lowerCaseOutput = toLowerCaseManual(input);

        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + upperCaseOutput);
        System.out.println("Lowercase: " + lowerCaseOutput);
    }
//To uppercase
    public static String toUpperCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
// To Lowercase
    public static String toLowerCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
