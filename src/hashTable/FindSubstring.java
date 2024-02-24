package hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubstring {

    public static void main(String[] args) {
        String[] words = {"bar","foo","the"};
        System.out.println(findSubstring("barfoofoobarthefoobarman", words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indexes = new ArrayList<>();
        Set<String> concatWords = new HashSet<>();
         StringBuilder stringBuilder = null;
        for (int i = 0; i < words.length; i++) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(words[i]);
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    stringBuilder.append(words[j]);
                }
            }
            concatWords.add(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(words[i]);
            for (int j = words.length - 1; j >= 0; j--) {
                if (i != j) {
                    stringBuilder.append(words[j]);
                }
            }
            concatWords.add(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(words[i]);
            for (int j = words.length/2 - 1; j >= 0; j--) {
                if (i != j) {
                    stringBuilder.append(words[j]);
                }
            }
            for (int j = words.length/2; j < words.length; j++) {
                if (i != j) {
                    stringBuilder.append(words[j]);
                }
            }
            concatWords.add(stringBuilder.toString());
        }

        for (String outputWord : concatWords) {
            if (s.contains(outputWord)) {
                indexes.add(s.indexOf(outputWord));
            }
        }
        return indexes;
    }
}
