package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> newList = new ArrayList<>();
        if (digits.equals("")) {
            return new ArrayList<>();
        }
       // String[] split = digits.split("");
        String[] strings = new String[digits.length()];
        for (int i = 0; i < strings.length; i++) {
            switch (Integer.parseInt(String.valueOf(digits.charAt(i)))) {
                case 2 -> strings[i] = "abc";
                case 3 -> strings[i] = "def";
                case 4 -> strings[i] = "ghi";
                case 5 -> strings[i] = "jkl";
                case 6 -> strings[i] = "mno";
                case 7 -> strings[i] = "pqrs";
                case 8 -> strings[i] = "tuv";
                case 9 -> strings[i] = "wxyz";
            }
        }
        if (strings.length == 1) {
            for (int i = 0; i < strings[0].length(); i++) {
                    newList.add(String.valueOf(strings[0].charAt(i)));
                }
            return newList;
        }

        for (int i = 0; i < strings[0].length(); i++) {
            for (int j = 0; j < strings[1].length(); j++) {
                newList.add(strings[0].charAt(i) + "" + strings[1].charAt(j));
            }
        }
        System.out.println(newList);
        return newList;
    }
}
