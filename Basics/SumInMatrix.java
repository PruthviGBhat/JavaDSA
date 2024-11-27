import java.util.*;

class SumInMatrix {
    public static int matrixSum(int[][] nums) {
        for (int arr[] : nums) {
            Arrays.sort(arr);
        }
        int sum = 0;
        for (int i = nums[0].length - 1; i >= 0; i--) {
            int large = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j][i] > large) {
                    large = nums[j][i];
                }
            }
            sum = sum + large;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[][] = { { 2, 4, 8, 2 }, { 7, 4, 9, 5 }, { 4, 9, 7, 6 } };
        System.out.println(matrixSum(nums));
    }
}