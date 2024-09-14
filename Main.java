import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange", "apple", "pear"};

        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        wordAnalyzer.analyzeWords(words);
    }
}