public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int k2=k%nums.length;
        swap(nums,0,nums.length-k2-1);
        swap(nums,nums.length-k2,nums.length-1);
        swap(nums,0,nums.length-1);
    }
    public static void swap(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums,3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
