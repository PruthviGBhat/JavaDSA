class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int left=0;
        int window=0;
        for(int right=0;right<nums.length;right++){
            window=window+nums[right];
            while(window>=target){
                ans=Math.min(ans,right-left+1);
                window=window-nums[left++];
            }
        }
        if(ans<Integer.MAX_VALUE){
            return ans;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        int nums[]={1,2,5,4,3,2};
        System.out.println(obj.minSubArrayLen(7, nums));
    }
}