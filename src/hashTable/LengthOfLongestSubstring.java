package hashTable;

import java.util.Arrays;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("end: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int countUnique = 0;
        int[] arrayUnique = new int[1];
        int lengthArray = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                countUnique++;
                if (s.charAt(i) == s.charAt(j)) {
                    arrayUnique[lengthArray - 1] = countUnique;
                    lengthArray++;
                    arrayUnique = Arrays.copyOf(arrayUnique, lengthArray);
                    countUnique = 0;
                }
            }
            countUnique = 0;
        }
        int maxUniqueCountOfSubstring = arrayUnique[0];
        for (int i = 1; i < arrayUnique.length; i++) {
            if (maxUniqueCountOfSubstring <= arrayUnique[i]){
                maxUniqueCountOfSubstring = arrayUnique[i];
            }
        }
        return maxUniqueCountOfSubstring;
    }
}
