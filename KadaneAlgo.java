public class KadaneAlgo {
    public static void main(String args[]){
        int arr[]={5,-9,4,3,-2,-7,-3,5,8};
        int maxsum=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum>=0){
                sum=sum+arr[i];
            }else{
                sum=arr[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
    }
    
}