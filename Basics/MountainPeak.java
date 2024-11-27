public class MountainPeak {
    public static int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]<arr[mid+1]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 2, 1, 0};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("The peak index is: " + peakIndex);
    }
}