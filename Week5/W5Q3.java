package Week5;
import java.util.StringTokenizer;
import java.util.Scanner;

public class W5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Text: ");
        String text = sc.nextLine();

        int wordCount = 0;
        int sentenceCount = 0;
        int eCount = 0;
        int zCount = 0;

        StringTokenizer words = new StringTokenizer(text);
        wordCount = words.countTokens();

        StringTokenizer sentences = new StringTokenizer(text, ".!?;");
        sentenceCount = sentences.countTokens();

        for (char c : text.toCharArray()) {
            if (c == 'e') {
                eCount++;
            } else if (c == 'z') {
                zCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of 'e' occurrences: " + eCount);
        System.out.println("Number of 'z' occurrences: " + zCount);
        
        sc.close();
    }
}
