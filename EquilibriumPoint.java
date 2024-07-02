public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[] = {-7,4,2,5,-9,8,0};
        int rightsum=0;
        int leftsum=0;
        
        for(int i=1;i<arr.length;i++){
            rightsum=rightsum+arr[i];
        }
        for(int j=0;j<arr.length-1;j++){
            int res=-1;
            if(rightsum==leftsum){
                res=j+1;
                System.out.println(res);
                break;
            }
            leftsum=leftsum+arr[j];
            rightsum=rightsum-arr[j+1];
        }
        
    }
}
