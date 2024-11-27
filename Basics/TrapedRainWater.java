class RainWaterContainer {
    public int trap(int[] height) {
        int res = 0;
        int lb[] = new int[height.length];
        int rb[] = new int[height.length];
        
        // Calculate left boundary heights
        lb[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            lb[i] = Math.max(height[i], lb[i - 1]);
        }
        
        // Calculate right boundary heights
        rb[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rb[i] = Math.max(height[i], rb[i + 1]);
        }
        
        // Calculate trapped water
        for (int i = 0; i < height.length; i++) {
            res += Math.min(rb[i], lb[i]) - height[i];
        }
        
        return res;
    }
}

public class TrapedRainWater {
    public static void main(String[] args) {
        // Create an instance of Solution
        RainWaterContainer solution = new RainWaterContainer();
        
        // Define the height array (example input)
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        
        // Calculate the amount of trapped water
        int result = solution.trap(height);
        
        // Print the result
        System.out.println("Trapped rainwater: " + result);
    }
}