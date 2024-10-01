import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int conssequ=1;
        int maxsequ=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1]){
                conssequ++;
            }else{
                maxsequ=Math.max(maxsequ,conssequ);
                conssequ=1;
            }
        }
        int temp = Math.max(maxsequ,conssequ);
        return temp;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3,2};
        System.out.println(lcs.longestConsecutive(nums));
    }
}
