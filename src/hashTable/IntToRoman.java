package hashTable;

public class IntToRoman {

    public static void main(String[] args) {
        System.out.println("end: " + intToRoman(1756));
    }

    public static StringBuilder intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int countLap = 0;
        while (num % 10 > 0) {
            int value = num % 10;
            if (countLap == 3) {
                if (value == 5) {
                    stringBuilder.append("L");
                }
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

        return stringBuilder.reverse();
    }

    public static void lap(StringBuilder stringBuilder, int value,
                           String C,
                           String D,
                           String M,
                           String L) {
        if (value == 5) {
            stringBuilder.append(L);
        }
        if (value == 1) {
            stringBuilder.append(C);
        }
        if (value > 5 && value < 9) {
            while (value > 5) {
                stringBuilder.append(C);
                value--;
            }
            stringBuilder.append(D);
        }
        if (value < 4) {
            while (value > 0) {
                stringBuilder.append(C);
                value--;
            }
        }
        if (value == 4) {
            stringBuilder.append(D).append(C);
        }
        if (value == 9) {
            stringBuilder.append(M).append(C);
        }
    }
}
