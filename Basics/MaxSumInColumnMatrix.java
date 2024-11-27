import java.util.Arrays;

public class MaxSumInColumnMatrix {

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
        int arr[][]={{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        System.out.println(matrixSum(arr));
    }
}
