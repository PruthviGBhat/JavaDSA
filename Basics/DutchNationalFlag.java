class DutchNationalFlag{
    public static void sortColors(int[] nums) {
        int left=0;
        int looper=0;
        int right=nums.length-1;
        while(looper<=right){
            if(nums[looper]==0){
                swap(nums,looper,left);
                left++;
                looper++;
            }else if(nums[looper]==2){
                swap(nums,looper,right);
                right--;
            }else{
                looper++;
            }
        }
    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,2,1,2,0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}