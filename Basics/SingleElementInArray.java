import java.util.*;

public class SingleElementInArray {
    public static int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                mid=mid-1;
            }
            int leftpartlength=mid-left+1;
            if(leftpartlength%2==1){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return nums[right]; 
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int result = singleNonDuplicate(nums);
        System.out.println("The single element that appears only once is: " + result);
    }
}