import java.util.*;
public class PermutationOfString{
    public static void solution(String str){
        int n=str.length();
        int f = factorial(n);
        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp=i;
            for(int div=n;div>=1;div--){
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int f1 = 1;
        for(int i=n;i>=1;i--){
            f1=f1*i;
        }
        return f1;
    }
	public static void main(String[] args) {
		solution("abc");
	}
}