package hashTable;

public class Test {
    public static void main(String[] args) {
        System.out.println("end: " + intToRoman(1555));
    }

    public static String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int countLap = 0;
        while (num % 10 > 0) {
            int value = num % 10;
            if (countLap == 3) {
                while (value > 0) {
                    stringBuilder.append("M");
                    value--;
                }
            }
            if (countLap == 2) {
                lap(stringBuilder, value, "C", "D", "M", "D");
            }

            if (countLap == 1) {
                lap(stringBuilder, value, "X", "L", "C", "L");
            }

            if (countLap == 0) {
                lap(stringBuilder, value, "I", "V", "X", "V");
            }
            num = num / 10;
            countLap++;
        }

        return stringBuilder.reverse().toString();
    }

    public static void lap(StringBuilder stringBuilder, int value,
                           String firstValue,
                           String secondValue,
                           String thirdValue,
                           String fourthValue) {
        if (value == 5) {
            stringBuilder.append(fourthValue);
        }
        if (value == 1) {
            stringBuilder.append(firstValue);
        }
        if (value > 5 && value < 9) {
            while (value > 5) {
                stringBuilder.append(firstValue);
                value--;
            }
            stringBuilder.append(secondValue);
        }
        if (value < 4) {
            while (value > 0) {
                stringBuilder.append(firstValue);
                value--;
            }
        }
        if (value == 4) {
            stringBuilder.append(secondValue).append(firstValue);
        }
        if (value == 9) {
            stringBuilder.append(thirdValue).append(firstValue);
        }
    }
}
