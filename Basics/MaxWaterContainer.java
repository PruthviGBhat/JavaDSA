public class MaxWaterContainer {
    public static int maxArea(int[] height) {
        int maxarea=0;
        int currmax=0;
        int i=0;
        int min=0;
        int diff=0;
        int j=height.length-1;
        while(i<j){
            min=Math.min(height[i],height[j]);
            diff=j-i;
            currmax=min*diff;
            if(currmax>maxarea){
                maxarea=currmax;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxArea(height);
        System.out.println("Maximum area is: " + maxArea);
    }
}


    
