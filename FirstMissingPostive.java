import java.util.Arrays;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (missing == nums[i]) {
                    missing++;
                } else if (nums[i] > missing) {
                    break;
                }
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        FirstMissingPositive fm = new FirstMissingPositive();
        
        // Example input
        int[] nums = {3, 4, -1, 1};
        
        // Calling the method and printing the result
        int result = fm.firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);
    }
}