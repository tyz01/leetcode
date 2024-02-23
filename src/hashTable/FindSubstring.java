package hashTable;

import java.util.ArrayList;
import java.util.List;

public class FindSubstring {

    public static void main(String[] args) {
        String[] words = {"word", "good", "best", "word"};
        System.out.println(findSubstring("wordgoodgoodgoodbestword", words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indexes = new ArrayList<>();
        List<String> concatWords = new ArrayList<>();
        StringBuilder stringBuilder = null;
        int countLap = 0;
        for (int i = 0; i < words.length; i++) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(words[i]);
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    stringBuilder.append(words[j]);
                }
            }
            concatWords.add(stringBuilder.toString());
        }
        System.out.println("words: " + concatWords);
        for (int i = concatWords.size() - 1; i >= 0; i--) {
            if (s.contains(concatWords.get(i))) {
                System.out.println("word: " + concatWords.get(i) + ", index word: " + s.indexOf(concatWords.get(i)));
                indexes.add(s.indexOf(concatWords.get(i)));
            }
        }
        return indexes;
    }
}
