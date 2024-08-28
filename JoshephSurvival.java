import java.util.*;

public class JoshephSurvival{
    public static int survior(int n,int k){
        if(n==1){
            return 1;
        }
        return (survior(n-1,k)+k-1)%n+1;
    }
	public static void main(String[] args) {
		int arr[]={8,2,7,3,6,4,8};
		int k=3;
		int n=arr.length;;
		int result=survior(n,k);
		System.out.println(result);
	}
}

