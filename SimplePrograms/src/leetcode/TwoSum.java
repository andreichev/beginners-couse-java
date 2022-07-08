package leetcode;

public class TwoSum {
    public static void main(String[] args) {
        printArray(twoSum(new int[] {1, 2, 3, 4}, 3));
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }
        }
        return new int[]{};
    }
}
