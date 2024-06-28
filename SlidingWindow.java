public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {5,3,-8,-1,4,7,3};
        int k=3;  //size of the window
        int wsum=0;
        int maxsum=0;

        for(int i=0;i<k;i++){
            wsum=wsum+arr[i];
            if(wsum>maxsum){
                maxsum=wsum;
            }
        }
        for(int i=k;i<arr.length;i++){
            wsum=wsum+arr[i]-arr[i-k];
            if(wsum>maxsum){
                maxsum=wsum;
            }
        }
        System.out.println(maxsum);
    }
}
