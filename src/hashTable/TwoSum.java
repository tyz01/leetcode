package hashTable;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] outputArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(nums[i] + " " + nums[j]);
                if (nums[i] + nums[j] == target) {
                    outputArray[0] = i;
                    outputArray[1] = j;
                    break;
                }
            }
        }
        return outputArray;
    }
}