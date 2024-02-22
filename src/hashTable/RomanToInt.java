package hashTable;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println("end: " + romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        int date = 0;
        Map<Character, Integer> romanDigitals = new HashMap<>();
        romanDigitals.put('I', 1);
        romanDigitals.put('V', 5);
        romanDigitals.put('X', 10);
        romanDigitals.put('L', 50);
        romanDigitals.put('C', 100);
        romanDigitals.put('D', 500);
        romanDigitals.put('M', 1000);
        int maxValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (Map.Entry<Character, Integer> romanDigit : romanDigitals.entrySet()) {
                if (s.charAt(i) == romanDigit.getKey()) {
                    if (maxValue <= romanDigit.getValue()) {
                        date += romanDigit.getValue();
                    } else {
                        date -= romanDigit.getValue();

                    }
                    maxValue = romanDigit.getValue();
              }
            }
        }
        return date;
    }

}
