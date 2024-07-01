public class LeaderInArray{
    public static void main(String[] args) {
        int arr[] = {4,9,3,7,1,5,7,6};
        int curElem = arr[arr.length-1];
        System.out.print(curElem+" ");

        for(int i=arr.length-2;i>0;i--){
            if(arr[i]>curElem){
                curElem=arr[i];
                System.out.print(curElem+" ");
            }
        }
    }
}