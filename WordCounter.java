import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or paragraph to count the words:");
        String inputText = scanner.nextLine();

        int wordCount = countWords(inputText);
        System.out.println("The number of words in the text is: " + wordCount);

        scanner.close();
    }

    // Method to count words in a string
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Split by one or more whitespace characters
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
